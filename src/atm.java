import java.nio.file.Path;
import java.util.Map;

interface atm {
   atm a = new atm() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atm b = new atm() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atj> c) implements atm {
      public Map<String, atj> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atm {
      public Path a() {
         return this.c;
      }
   }
}
