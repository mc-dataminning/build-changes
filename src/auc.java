import java.nio.file.Path;
import java.util.Map;

interface auc {
   auc a = new auc() {
      @Override
      public String toString() {
         return "empty";
      }
   };
   auc b = new auc() {
      @Override
      public String toString() {
         return "relative";
      }
   };

   public static record a(Map<String, atz> c) implements auc {
      public Map<String, atz> a() {
         return this.c;
      }
   }

   public static record b(Path c) implements auc {
      public Path a() {
         return this.c;
      }
   }
}
