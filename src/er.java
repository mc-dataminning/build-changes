import java.util.Map;
import javax.annotation.Nullable;

public interface er {
   er a = new er() {
      @Nullable
      @Override
      public xt a(String $$0) {
         return null;
      }
   };

   @Nullable
   xt a(String var1);

   public static record a(Map<String, xt> b) implements er {
      @Nullable
      @Override
      public xt a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xt> a() {
         return this.b;
      }
   }
}
