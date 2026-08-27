import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fnf implements aqk {
   private Map<fnh, fnp> a = ImmutableMap.of();

   public fnj a(fnh $$0) {
      fnp $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aqj $$0) {
      this.a = ImmutableMap.copyOf(fng.a());
   }
}
