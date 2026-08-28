import java.util.Map;
import javax.annotation.Nullable;

public interface eu {
   eu a = new eu() {
      @Nullable
      @Override
      public yl a(String $$0) {
         return null;
      }
   };

   @Nullable
   yl a(String var1);

   public static record a(Map<String, yl> b) implements eu {
      @Nullable
      @Override
      public yl a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, yl> a() {
         return this.b;
      }
   }
}
