import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bwa extends bws<blq> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.J, bvn.h);
   }

   protected void a(and $$0, blq $$1) {
      $$1.dO().c(bvn.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(blq $$0, bvp $$1) {
      Optional<blq> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(blq.class::cast);
      $$0.dO().a(bvn.J, $$2);
   }
}
