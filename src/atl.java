import java.nio.file.Path;
import java.util.Map;

interface atl {
   atl a = new atl() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atl b = new atl() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ati> c) implements atl {
      public Map<String, ati> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atl {
      public Path a() {
         return this.c;
      }
   }
}
