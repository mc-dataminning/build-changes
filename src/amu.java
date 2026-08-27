import java.nio.file.Path;
import java.util.Map;

interface amu {
   amu a = new amu() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   amu b = new amu() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amr> c) implements amu {
      public Map<String, amr> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements amu {
      public Path a() {
         return this.c;
      }
   }
}
