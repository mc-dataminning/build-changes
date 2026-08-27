import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fmt implements aqj {
   private Map<fmv, fnd> a = ImmutableMap.of();

   public fmx a(fmv $$0) {
      fnd $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aqi $$0) {
      this.a = ImmutableMap.copyOf(fmu.a());
   }
}
