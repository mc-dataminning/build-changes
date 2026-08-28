import java.nio.file.Path;
import java.util.Map;

interface atw {
   atw a = new atw() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atw b = new atw() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, att> c) implements atw {
      public Map<String, att> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atw {
      public Path a() {
         return this.c;
      }
   }
}
