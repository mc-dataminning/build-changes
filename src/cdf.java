import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdf extends cdy<bsl> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.K, ccs.h);
   }

   protected void a(aqu $$0, bsl $$1) {
      $$1.dT().c(ccs.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsl $$0, ccu $$1) {
      Optional<bsl> $$2 = $$1.a($$1x -> $$1x.am() == $$0.am() && !$$1x.o_()).map(bsl.class::cast);
      $$0.dT().a(ccs.K, $$2);
   }
}
