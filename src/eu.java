import java.util.Map;
import javax.annotation.Nullable;

public interface eu {
   eu a = new eu() {
      @Nullable
      @Override
      public xz a(String $$0) {
         return null;
      }
   };

   @Nullable
   xz a(String var1);

   public static record a(Map<String, xz> b) implements eu {
      @Nullable
      @Override
      public xz a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xz> a() {
         return this.b;
      }
   }
}
