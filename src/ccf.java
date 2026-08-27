import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ccf extends ccy<bro> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.K, cbs.h);
   }

   protected void a(aqm $$0, bro $$1) {
      $$1.dS().c(cbs.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bro $$0, cbu $$1) {
      Optional<bro> $$2 = $$1.a($$1x -> $$1x.ak() == $$0.ak() && !$$1x.p_()).map(bro.class::cast);
      $$0.dS().a(cbs.K, $$2);
   }
}
