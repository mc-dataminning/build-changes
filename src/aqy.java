import java.nio.file.Path;
import java.util.Map;

interface aqy {
   aqy a = new aqy() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aqy b = new aqy() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aqv> c) implements aqy {
      public Map<String, aqv> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aqy {
      public Path a() {
         return this.c;
      }
   }
}
