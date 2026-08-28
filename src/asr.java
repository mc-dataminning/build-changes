import java.nio.file.Path;
import java.util.Map;

interface asr {
   asr a = new asr() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   asr b = new asr() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aso> c) implements asr {
      public Map<String, aso> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements asr {
      public Path a() {
         return this.c;
      }
   }
}
