import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bsn extends bte<bid> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.J, bsa.h);
   }

   protected void a(akk $$0, bid $$1) {
      $$1.dM().c(bsa.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bid $$0, bsc $$1) {
      Optional<bid> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.i_()).map(bid.class::cast);
      $$0.dM().a(bsa.J, $$2);
   }
}
