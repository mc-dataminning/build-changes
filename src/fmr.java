import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fmr implements aqi {
   private Map<fmt, fnb> a = ImmutableMap.of();

   public fmv a(fmt $$0) {
      fnb $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aqh $$0) {
      this.a = ImmutableMap.copyOf(fms.a());
   }
}
