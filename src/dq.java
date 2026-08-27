import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public vr a(String $$0) {
         return null;
      }
   };

   @Nullable
   vr a(String var1);

   public static record a(Map<String, vr> b) implements dq {
      @Nullable
      @Override
      public vr a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, vr> a() {
         return this.b;
      }
   }
}
