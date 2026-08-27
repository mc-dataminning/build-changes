import java.nio.file.Path;
import java.util.Map;

interface aob {
   aob a = new aob() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   aob b = new aob() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, any> c) implements aob {
      public Map<String, any> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements aob {
      public Path a() {
         return this.c;
      }
   }
}
