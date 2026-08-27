import java.nio.file.Path;
import java.util.Map;

interface apa {
   apa a = new apa() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   apa b = new apa() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aox> c) implements apa {
      public Map<String, aox> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements apa {
      public Path a() {
         return this.c;
      }
   }
}
