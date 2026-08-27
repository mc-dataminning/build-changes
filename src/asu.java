import java.nio.file.Path;
import java.util.Map;

interface asu {
   asu a = new asu() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   asu b = new asu() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asr> c) implements asu {
      public Map<String, asr> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements asu {
      public Path a() {
         return this.c;
      }
   }
}
