import java.nio.file.Path;
import java.util.Map;

interface aur {
   aur a = new aur() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aur b = new aur() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, auo> c) implements aur {
      public Map<String, auo> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aur {
      public Path a() {
         return this.c;
      }
   }
}
