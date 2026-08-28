import java.nio.file.Path;
import java.util.Map;

interface ats {
   ats a = new ats() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ats b = new ats() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atp> c) implements ats {
      public Map<String, atp> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ats {
      public Path a() {
         return this.c;
      }
   }
}
