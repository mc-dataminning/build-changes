import java.nio.file.Path;
import java.util.Map;

interface aph {
   aph a = new aph() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aph b = new aph() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ape> c) implements aph {
      public Map<String, ape> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aph {
      public Path a() {
         return this.c;
      }
   }
}
