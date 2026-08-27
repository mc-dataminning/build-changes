import java.nio.file.Path;
import java.util.Map;

interface asb {
   asb a = new asb() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   asb b = new asb() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, ary> c) implements asb {
      public Map<String, ary> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements asb {
      public Path a() {
         return this.c;
      }
   }
}
