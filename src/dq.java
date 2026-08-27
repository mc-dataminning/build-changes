import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public vt a(String $$0) {
         return null;
      }
   };

   @Nullable
   vt a(String var1);

   public static record a(Map<String, vt> b) implements dq {
      @Nullable
      @Override
      public vt a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vt> a() {
         return this.b;
      }
   }
}
