import java.nio.file.Path;
import java.util.Map;

interface aoj {
   aoj a = new aoj() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aoj b = new aoj() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aog> c) implements aoj {
      public Map<String, aog> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aoj {
      public Path a() {
         return this.c;
      }
   }
}
