import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cde extends cdx<bsm> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.K, ccr.h);
   }

   protected void a(are $$0, bsm $$1) {
      $$1.dS().c(ccr.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsm $$0, cct $$1) {
      Optional<bsm> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bsm.class::cast);
      $$0.dS().a(ccr.K, $$2);
   }
}
