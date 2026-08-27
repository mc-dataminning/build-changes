import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cae extends cax<bpp> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.K, bzr.h);
   }

   protected void a(aps $$0, bpp $$1) {
      $$1.dP().c(bzr.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bpp $$0, bzt $$1) {
      Optional<bpp> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.p_()).map(bpp.class::cast);
      $$0.dP().a(bzr.K, $$2);
   }
}
