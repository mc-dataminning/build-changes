import java.util.Map;
import javax.annotation.Nullable;

public interface eh {
   eh a = new eh() {
      @Nullable
      @Override
      public xo a(String $$0) {
         return null;
      }
   };

   @Nullable
   xo a(String var1);

   public static record a(Map<String, xo> b) implements eh {
      @Nullable
      @Override
      public xo a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, xo> a() {
         return this.b;
      }
   }
}
