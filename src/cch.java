import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cch extends cda<brq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.K, cbu.h);
   }

   protected void a(aqn $$0, brq $$1) {
      $$1.dS().c(cbu.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(brq $$0, cbw $$1) {
      Optional<brq> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(brq.class::cast);
      $$0.dS().a(cbu.K, $$2);
   }
}
