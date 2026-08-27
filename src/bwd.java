import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bwd extends bww<blr> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.K, bvq.h);
   }

   protected void a(ane $$0, blr $$1) {
      $$1.dN().c(bvq.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(blr $$0, bvs $$1) {
      Optional<blr> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(blr.class::cast);
      $$0.dN().a(bvq.K, $$2);
   }
}
