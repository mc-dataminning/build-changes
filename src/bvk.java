import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bvk extends bwc<bla> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.J, bux.h);
   }

   protected void a(amp $$0, bla $$1) {
      $$1.dO().c(bux.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bla $$0, buz $$1) {
      Optional<bla> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bla.class::cast);
      $$0.dO().a(bux.J, $$2);
   }
}
