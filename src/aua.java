import java.nio.file.Path;
import java.util.Map;

interface aua {
   aua a = new aua() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aua b = new aua() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atx> c) implements aua {
      public Map<String, atx> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aua {
      public Path a() {
         return this.c;
      }
   }
}
