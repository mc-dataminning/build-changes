import java.nio.file.Path;
import java.util.Map;

interface arz {
   arz a = new arz() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   arz b = new arz() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, arw> c) implements arz {
      public Map<String, arw> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements arz {
      public Path a() {
         return this.c;
      }
   }
}
