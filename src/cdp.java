import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdp extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.X);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      if ($$1.be()) {
         $$1.dS().a(ccu.X, bac.a);
      } else {
         $$1.dS().b(ccu.X);
      }
   }
}
