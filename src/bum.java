import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bum extends bvd<bkd> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.J, btz.h);
   }

   protected void a(ama $$0, bkd $$1) {
      $$1.dN().c(btz.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bkd $$0, bub $$1) {
      Optional<bkd> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.n_()).map(bkd.class::cast);
      $$0.dN().a(btz.J, $$2);
   }
}
