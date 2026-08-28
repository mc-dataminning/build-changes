import java.nio.file.Path;
import java.util.Map;

interface atb {
   atb a = new atb() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atb b = new atb() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asy> c) implements atb {
      public Map<String, asy> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atb {
      public Path a() {
         return this.c;
      }
   }
}
