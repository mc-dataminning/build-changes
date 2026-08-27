import java.nio.file.Path;
import java.util.Map;

interface anr {
   anr a = new anr() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   anr b = new anr() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ano> c) implements anr {
      public Map<String, ano> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements anr {
      public Path a() {
         return this.c;
      }
   }
}
