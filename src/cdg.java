import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdg extends cdz<bso> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.K, cct.h);
   }

   protected void a(arf $$0, bso $$1) {
      $$1.dS().c(cct.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bso $$0, ccv $$1) {
      Optional<bso> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bso.class::cast);
      $$0.dS().a(cct.K, $$2);
   }
}
