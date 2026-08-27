import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public vw a(String $$0) {
         return null;
      }
   };

   @Nullable
   vw a(String var1);

   public static record a(Map<String, vw> b) implements dq {
      @Nullable
      @Override
      public vw a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vw> a() {
         return this.b;
      }
   }
}
