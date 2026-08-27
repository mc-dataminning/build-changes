import java.nio.file.Path;
import java.util.Map;

interface aoq {
   aoq a = new aoq() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aoq b = new aoq() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, aon> c) implements aoq {
      public Map<String, aon> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aoq {
      public Path a() {
         return this.c;
      }
   }
}
