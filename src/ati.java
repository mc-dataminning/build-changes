import java.nio.file.Path;
import java.util.Map;

interface ati {
   ati a = new ati() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ati b = new ati() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atf> c) implements ati {
      public Map<String, atf> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ati {
      public Path a() {
         return this.c;
      }
   }
}
