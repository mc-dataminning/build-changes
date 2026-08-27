import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsp extends btg<big> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.J, bsc.h);
   }

   protected void a(akn $$0, big $$1) {
      $$1.dM().c(bsc.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(big $$0, bse $$1) {
      Optional<big> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.i_()).map(big.class::cast);
      $$0.dM().a(bsc.J, $$2);
   }
}
