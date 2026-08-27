import java.nio.file.Path;
import java.util.Map;

interface arl {
   arl a = new arl() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   arl b = new arl() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ari> c) implements arl {
      public Map<String, ari> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements arl {
      public Path a() {
         return this.c;
      }
   }
}
