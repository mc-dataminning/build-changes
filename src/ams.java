import java.nio.file.Path;
import java.util.Map;

interface ams {
   ams a = new ams() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   ams b = new ams() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amp> c) implements ams {
      public Map<String, amp> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements ams {
      public Path a() {
         return this.c;
      }
   }
}
