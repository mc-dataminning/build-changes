import java.nio.file.Path;
import java.util.Map;

interface atn {
   atn a = new atn() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   atn b = new atn() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atk> c) implements atn {
      public Map<String, atk> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements atn {
      public Path a() {
         return this.c;
      }
   }
}
