import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cce extends ccx<brp> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.K, cbr.h);
   }

   protected void a(aqt $$0, brp $$1) {
      $$1.dZ().c(cbr.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(brp $$0, cbt $$1) {
      Optional<brp> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.o_()).map(brp.class::cast);
      $$0.dZ().a(cbr.K, $$2);
   }
}
