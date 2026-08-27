import java.nio.file.Path;
import java.util.Map;

interface apf {
   apf a = new apf() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   apf b = new apf() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, apc> c) implements apf {
      public Map<String, apc> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements apf {
      public Path a() {
         return this.c;
      }
   }
}
