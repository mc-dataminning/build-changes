import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class btx extends buo<bjo> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.J, btk.h);
   }

   protected void a(alq $$0, bjo $$1) {
      $$1.dN().c(btk.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bjo $$0, btm $$1) {
      Optional<bjo> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.n_()).map(bjo.class::cast);
      $$0.dN().a(btk.J, $$2);
   }
}
