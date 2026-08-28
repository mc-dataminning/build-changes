import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdd extends cdw<bsk> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.K, ccq.h);
   }

   protected void a(aqt $$0, bsk $$1) {
      $$1.dU().c(ccq.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsk $$0, ccs $$1) {
      Optional<bsk> $$2 = $$1.a($$1x -> $$1x.am() == $$0.am() && !$$1x.o_()).map(bsk.class::cast);
      $$0.dU().a(ccq.K, $$2);
   }
}
