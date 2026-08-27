import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fml implements aqd {
   private Map<fmn, fmv> a = ImmutableMap.of();

   public fmp a(fmn $$0) {
      fmv $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aqc $$0) {
      this.a = ImmutableMap.copyOf(fmm.a());
   }
}
