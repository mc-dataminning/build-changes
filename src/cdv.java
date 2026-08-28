import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cdv extends ceo<btc> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.K, cdi.h);
   }

   protected void a(arg $$0, btc $$1) {
      $$1.dX().c(cdi.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(btc $$0, cdk $$1) {
      Optional<btc> $$2 = $$1.a($$1x -> $$1x.ao() == $$0.ao() && !$$1x.o_()).map(btc.class::cast);
      $$0.dX().a(cdi.K, $$2);
   }
}
