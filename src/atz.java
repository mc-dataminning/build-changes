import java.nio.file.Path;
import java.util.Map;

interface atz {
   atz a = new atz() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atz b = new atz() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atw> c) implements atz {
      public Map<String, atw> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atz {
      public Path a() {
         return this.c;
      }
   }
}
