import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cbq extends ccj<brb> {
   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.K, cbd.h);
   }

   protected void a(aqh $$0, brb $$1) {
      $$1.dQ().c(cbd.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(brb $$0, cbf $$1) {
      Optional<brb> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.p_()).map(brb.class::cast);
      $$0.dQ().a(cbd.K, $$2);
   }
}
