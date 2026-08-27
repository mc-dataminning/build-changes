import java.nio.file.Path;
import java.util.Map;

interface asl {
   asl a = new asl() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   asl b = new asl() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, asi> c) implements asl {
      public Map<String, asi> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements asl {
      public Path a() {
         return this.c;
      }
   }
}
