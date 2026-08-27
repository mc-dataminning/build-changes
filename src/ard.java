import java.nio.file.Path;
import java.util.Map;

interface ard {
   ard a = new ard() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ard b = new ard() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ara> c) implements ard {
      public Map<String, ara> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ard {
      public Path a() {
         return this.c;
      }
   }
}
