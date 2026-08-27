import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class foy implements asb {
   private Map<fpa, fpi> a = ImmutableMap.of();

   public fpc a(fpa $$0) {
      fpi $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(asa $$0) {
      this.a = ImmutableMap.copyOf(foz.a());
   }
}
