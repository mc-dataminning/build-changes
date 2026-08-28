import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cgt extends chm<bvv> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.L, cgg.h);
   }

   protected void a(arq $$0, bvv $$1) {
      $$1.ec().c(cgg.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvv $$0, cgi $$1) {
      Optional<bvv> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.n_()).map(bvv.class::cast);
      $$0.ec().a(cgg.L, $$2);
   }
}
