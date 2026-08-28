import java.nio.file.Path;
import java.util.Map;

interface aty {
   aty a = new aty() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aty b = new aty() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atv> c) implements aty {
      public Map<String, atv> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aty {
      public Path a() {
         return this.c;
      }
   }
}
