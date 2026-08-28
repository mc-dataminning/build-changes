import java.util.Map;
import javax.annotation.Nullable;

public interface eu {
   eu a = new eu() {
      @Nullable
      @Override
      public ya a(String $$0) {
         return null;
      }
   };

   @Nullable
   ya a(String var1);

   public static record a(Map<String, ya> b) implements eu {
      @Nullable
      @Override
      public ya a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ya> a() {
         return this.b;
      }
   }
}
