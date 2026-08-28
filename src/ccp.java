import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ccp extends cdi<brx> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.K, ccc.h);
   }

   protected void a(aqk $$0, brx $$1) {
      $$1.dT().c(ccc.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(brx $$0, cce $$1) {
      Optional<brx> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(brx.class::cast);
      $$0.dT().a(ccc.K, $$2);
   }
}
