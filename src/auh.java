import java.nio.file.Path;
import java.util.Map;

interface auh {
   auh a = new auh() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   auh b = new auh() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aue> c) implements auh {
      public Map<String, aue> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements auh {
      public Path a() {
         return this.c;
      }
   }
}
