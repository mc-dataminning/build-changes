import java.nio.file.Path;
import java.util.Map;

interface ami {
   ami a = new ami() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ami b = new ami() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amf> c) implements ami {
      public Map<String, amf> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ami {
      public Path a() {
         return this.c;
      }
   }
}
