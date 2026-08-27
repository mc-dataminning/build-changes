import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fhf implements anl {
   private Map<fhh, fhp> a = ImmutableMap.of();

   public fhj a(fhh $$0) {
      fhp $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(ank $$0) {
      this.a = ImmutableMap.copyOf(fhg.a());
   }
}
