import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bvu extends bwm<blk> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.J, bvh.h);
   }

   protected void a(amz $$0, blk $$1) {
      $$1.dO().c(bvh.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(blk $$0, bvj $$1) {
      Optional<blk> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(blk.class::cast);
      $$0.dO().a(bvh.J, $$2);
   }
}
