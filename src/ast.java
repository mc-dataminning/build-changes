import java.nio.file.Path;
import java.util.Map;

interface ast {
   ast a = new ast() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ast b = new ast() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asq> c) implements ast {
      public Map<String, asq> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ast {
      public Path a() {
         return this.c;
      }
   }
}
