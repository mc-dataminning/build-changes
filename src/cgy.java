import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cgy extends chr<bvy> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.L, cgl.h);
   }

   protected void a(arq $$0, bvy $$1) {
      $$1.eb().c(cgl.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvy $$0, cgn $$1) {
      Optional<bvy> $$2 = $$1.a($$1x -> $$1x.an() == $$0.an() && !$$1x.n_()).map(bvy.class::cast);
      $$0.eb().a(cgl.L, $$2);
   }
}
