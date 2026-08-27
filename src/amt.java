import java.nio.file.Path;
import java.util.Map;

interface amt {
   amt a = new amt() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   amt b = new amt() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, amq> c) implements amt {
      public Map<String, amq> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements amt {
      public Path a() {
         return this.c;
      }
   }
}
