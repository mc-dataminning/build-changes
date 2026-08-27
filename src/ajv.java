import java.nio.file.Path;
import java.util.Map;

interface ajv {
   ajv a = new ajv() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ajv b = new ajv() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ajs> c) implements ajv {
      public Map<String, ajs> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ajv {
      public Path a() {
         return this.c;
      }
   }
}
