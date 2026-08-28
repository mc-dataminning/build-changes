import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cez extends cfs<bud> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.K, cem.h);
   }

   protected void a(ard $$0, bud $$1) {
      $$1.eb().c(cem.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bud $$0, ceo $$1) {
      Optional<bud> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bud.class::cast);
      $$0.eb().a(cem.K, $$2);
   }
}
