import java.nio.file.Path;
import java.util.Map;

interface apg {
   apg a = new apg() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   apg b = new apg() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, apd> c) implements apg {
      public Map<String, apd> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements apg {
      public Path a() {
         return this.c;
      }
   }
}
