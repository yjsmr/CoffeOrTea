package com.example.coffeeortea;
import java.util.Scanner;
public class CoffeeOrTea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Coffee or tea, sir? [Write C or T]: ");
        String choice = scan.nextLine();

        if(choice.equals("C")){
            System.out.println("Wonderful choice");

            System.out.println("Would you like some cream as well? [Write Y or N]");
            String creamCoffee = scan.nextLine();
            if(creamCoffee.equals("Y")){
                System.out.println("There you go, coffee and cream");
            }
            else if(creamCoffee.equals("N")){
                System.out.println("Of course sir, black as night it is");
            }
            else{
                System.out.println("Sorry sir, we don't have that");
            }
        }
        else if(choice.equals("T")){
            System.out.println("Here's your tea, sir");

            System.out.println("Would you like a lemon [Y or N]");
            String lemon = scan.nextLine();
            if(lemon.equals("Y")){
                System.out.println("There you go, tea and a lemon slice. Enjoy!");
            }
            else if(lemon.equals("N")){
                System.out.println("It's not for everyone. Here you go, be careful though, it's quite hot");
            }
            else {
                System.out.println("Sorry sir, we don't have that");
            }

        }
        else{
            System.out.println("Don't be daft, ofc we don't have that");
        }

    }
}
