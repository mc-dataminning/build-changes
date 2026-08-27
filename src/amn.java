import java.nio.file.Path;
import java.util.Map;

interface amn {
   amn a = new amn() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   amn b = new amn() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amk> c) implements amn {
      public Map<String, amk> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements amn {
      public Path a() {
         return this.c;
      }
   }
}
