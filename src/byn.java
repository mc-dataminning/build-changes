import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class byn extends bzg<boa> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.K, bya.h);
   }

   protected void a(apa $$0, boa $$1) {
      $$1.dM().c(bya.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(boa $$0, byc $$1) {
      Optional<boa> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(boa.class::cast);
      $$0.dM().a(bya.K, $$2);
   }
}
