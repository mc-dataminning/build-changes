import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdf extends cdy<bsn> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.K, ccs.h);
   }

   protected void a(are $$0, bsn $$1) {
      $$1.dS().c(ccs.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsn $$0, ccu $$1) {
      Optional<bsn> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bsn.class::cast);
      $$0.dS().a(ccs.K, $$2);
   }
}
