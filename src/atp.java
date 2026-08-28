import java.nio.file.Path;
import java.util.Map;

interface atp {
   atp a = new atp() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atp b = new atp() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atm> c) implements atp {
      public Map<String, atm> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atp {
      public Path a() {
         return this.c;
      }
   }
}
