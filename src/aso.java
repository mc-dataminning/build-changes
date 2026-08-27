import java.nio.file.Path;
import java.util.Map;

interface aso {
   aso a = new aso() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aso b = new aso() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asl> c) implements aso {
      public Map<String, asl> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aso {
      public Path a() {
         return this.c;
      }
   }
}
