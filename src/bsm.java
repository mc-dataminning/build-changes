import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsm extends btd<bid> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.J, brz.h);
   }

   protected void a(akk $$0, bid $$1) {
      $$1.dM().c(brz.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bid $$0, bsb $$1) {
      Optional<bid> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.i_()).map(bid.class::cast);
      $$0.dM().a(brz.J, $$2);
   }
}
