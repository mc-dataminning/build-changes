import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fhj implements ann {
   private Map<fhl, fht> a = ImmutableMap.of();

   public fhn a(fhl $$0) {
      fht $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(anm $$0) {
      this.a = ImmutableMap.copyOf(fhk.a());
   }
}
