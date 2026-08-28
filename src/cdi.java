import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdi extends ceb<bsq> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.K, ccv.h);
   }

   protected void a(arf $$0, bsq $$1) {
      $$1.dS().c(ccv.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsq $$0, ccx $$1) {
      Optional<bsq> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bsq.class::cast);
      $$0.dS().a(ccv.K, $$2);
   }
}
