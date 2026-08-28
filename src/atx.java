import java.nio.file.Path;
import java.util.Map;

interface atx {
   atx a = new atx() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atx b = new atx() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atu> c) implements atx {
      public Map<String, atu> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atx {
      public Path a() {
         return this.c;
      }
   }
}
