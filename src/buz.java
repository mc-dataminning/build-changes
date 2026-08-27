import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class buz extends bvq<bkq> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.J, bum.h);
   }

   protected void a(ami $$0, bkq $$1) {
      $$1.dP().c(bum.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bkq $$0, buo $$1) {
      Optional<bkq> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bkq.class::cast);
      $$0.dP().a(bum.J, $$2);
   }
}
