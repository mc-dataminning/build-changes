import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public vv a(String $$0) {
         return null;
      }
   };

   @Nullable
   vv a(String var1);

   public static record a(Map<String, vv> b) implements dq {
      @Nullable
      @Override
      public vv a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vv> a() {
         return this.b;
      }
   }
}
