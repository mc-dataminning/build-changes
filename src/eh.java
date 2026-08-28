import java.util.Map;
import javax.annotation.Nullable;

public interface eh {
   eh a = new eh() {
      @Nullable
      @Override
      public xq a(String $$0) {
         return null;
      }
   };

   @Nullable
   xq a(String var1);

   public static record a(Map<String, xq> b) implements eh {
      @Nullable
      @Override
      public xq a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xq> a() {
         return this.b;
      }
   }
}
