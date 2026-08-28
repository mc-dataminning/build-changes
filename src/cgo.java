import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cgo extends chh<bvq> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.L, cgb.h);
   }

   protected void a(aro $$0, bvq $$1) {
      $$1.eb().c(cgb.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvq $$0, cgd $$1) {
      Optional<bvq> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.n_()).map(bvq.class::cast);
      $$0.eb().a(cgb.L, $$2);
   }
}
