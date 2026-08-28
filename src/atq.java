import java.nio.file.Path;
import java.util.Map;

interface atq {
   atq a = new atq() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atq b = new atq() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atn> c) implements atq {
      public Map<String, atn> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atq {
      public Path a() {
         return this.c;
      }
   }
}
