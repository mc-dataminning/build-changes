import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cgr extends chk<bvt> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.L, cge.h);
   }

   protected void a(arq $$0, bvt $$1) {
      $$1.eb().c(cge.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvt $$0, cgg $$1) {
      Optional<bvt> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.n_()).map(bvt.class::cast);
      $$0.eb().a(cge.L, $$2);
   }
}
