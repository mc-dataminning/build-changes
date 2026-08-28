import java.nio.file.Path;
import java.util.Map;

interface aue {
   aue a = new aue() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aue b = new aue() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aub> c) implements aue {
      public Map<String, aub> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aue {
      public Path a() {
         return this.c;
      }
   }
}
