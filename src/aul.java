import java.nio.file.Path;
import java.util.Map;

interface aul {
   aul a = new aul() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aul b = new aul() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aui> c) implements aul {
      public Map<String, aui> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aul {
      public Path a() {
         return this.c;
      }
   }
}
