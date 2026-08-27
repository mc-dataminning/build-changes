import java.nio.file.Path;
import java.util.Map;

interface amr {
   amr a = new amr() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   amr b = new amr() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amo> c) implements amr {
      public Map<String, amo> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements amr {
      public Path a() {
         return this.c;
      }
   }
}
