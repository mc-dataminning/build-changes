import java.util.Map;
import javax.annotation.Nullable;

public interface eu {
   eu a = new eu() {
      @Nullable
      @Override
      public yb a(String $$0) {
         return null;
      }
   };

   @Nullable
   yb a(String var1);

   public static record a(Map<String, yb> b) implements eu {
      @Nullable
      @Override
      public yb a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, yb> a() {
         return this.b;
      }
   }
}
