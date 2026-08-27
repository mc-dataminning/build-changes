import java.nio.file.Path;
import java.util.Map;

interface amk {
   amk a = new amk() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   amk b = new amk() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amh> c) implements amk {
      public Map<String, amh> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements amk {
      public Path a() {
         return this.c;
      }
   }
}
