import java.util.Map;
import javax.annotation.Nullable;

public interface eu {
   eu a = new eu() {
      @Nullable
      @Override
      public xy a(String $$0) {
         return null;
      }
   };

   @Nullable
   xy a(String var1);

   public static record a(Map<String, xy> b) implements eu {
      @Nullable
      @Override
      public xy a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xy> a() {
         return this.b;
      }
   }
}
