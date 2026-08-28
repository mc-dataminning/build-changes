import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cgg extends cgz<bvi> {
   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(cft.L, cft.h);
   }

   protected void a(arn $$0, bvi $$1) {
      $$1.eb().c(cft.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvi $$0, cfv $$1) {
      Optional<bvi> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.n_()).map(bvi.class::cast);
      $$0.eb().a(cft.L, $$2);
   }
}
