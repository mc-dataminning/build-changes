import java.util.Map;
import javax.annotation.Nullable;

public interface dq {
   dq a = new dq() {
      @Nullable
      @Override
      public tl a(String $$0) {
         return null;
      }
   };

   @Nullable
   tl a(String var1);

   public static record a(Map<String, tl> b) implements dq {
      @Nullable
      @Override
      public tl a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, tl> a() {
         return this.b;
      }
   }
}
