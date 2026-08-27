import java.nio.file.Path;
import java.util.Map;

interface aqz {
   aqz a = new aqz() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aqz b = new aqz() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aqw> c) implements aqz {
      public Map<String, aqw> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aqz {
      public Path a() {
         return this.c;
      }
   }
}
