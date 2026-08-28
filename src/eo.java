import java.util.Map;
import javax.annotation.Nullable;

public interface eo {
   eo a = new eo() {
      @Nullable
      @Override
      public xk a(String $$0) {
         return null;
      }
   };

   @Nullable
   xk a(String var1);

   public static record a(Map<String, xk> b) implements eo {
      @Nullable
      @Override
      public xk a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xk> a() {
         return this.b;
      }
   }
}
