import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ccs extends cdl<bsa> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.K, ccf.h);
   }

   protected void a(aqm $$0, bsa $$1) {
      $$1.dU().c(ccf.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsa $$0, cch $$1) {
      Optional<bsa> $$2 = $$1.a($$1x -> $$1x.al() == $$0.al() && !$$1x.p_()).map(bsa.class::cast);
      $$0.dU().a(ccf.K, $$2);
   }
}
