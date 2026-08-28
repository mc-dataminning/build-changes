import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdh extends cea<bsp> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.K, ccu.h);
   }

   protected void a(arf $$0, bsp $$1) {
      $$1.dS().c(ccu.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsp $$0, ccw $$1) {
      Optional<bsp> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bsp.class::cast);
      $$0.dS().a(ccu.K, $$2);
   }
}
