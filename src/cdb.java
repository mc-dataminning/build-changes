import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdb extends cdu<bsj> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.K, cco.h);
   }

   protected void a(arb $$0, bsj $$1) {
      $$1.dS().c(cco.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsj $$0, ccq $$1) {
      Optional<bsj> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bsj.class::cast);
      $$0.dS().a(cco.K, $$2);
   }
}
