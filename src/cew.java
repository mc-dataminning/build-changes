import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cew extends cfp<bua> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.K, cej.h);
   }

   protected void a(arc $$0, bua $$1) {
      $$1.ec().c(cej.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bua $$0, cel $$1) {
      Optional<bua> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bua.class::cast);
      $$0.ec().a(cej.K, $$2);
   }
}
