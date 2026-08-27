import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsl extends btc<bib> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.J, bry.h);
   }

   protected void a(aki $$0, bib $$1) {
      $$1.dM().c(bry.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bib $$0, bsa $$1) {
      Optional<bib> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.i_()).map(bib.class::cast);
      $$0.dM().a(bry.J, $$2);
   }
}
