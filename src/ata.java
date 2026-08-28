import java.nio.file.Path;
import java.util.Map;

interface ata {
   ata a = new ata() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ata b = new ata() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asx> c) implements ata {
      public Map<String, asx> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ata {
      public Path a() {
         return this.c;
      }
   }
}
