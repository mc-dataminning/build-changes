import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fms implements aqi {
   private Map<fmu, fnc> a = ImmutableMap.of();

   public fmw a(fmu $$0) {
      fnc $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aqh $$0) {
      this.a = ImmutableMap.copyOf(fmt.a());
   }
}
