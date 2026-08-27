import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bxu extends byn<bnj> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.K, bxh.h);
   }

   protected void a(aov $$0, bnj $$1) {
      $$1.dO().c(bxh.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bnj $$0, bxj $$1) {
      Optional<bnj> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bnj.class::cast);
      $$0.dO().a(bxh.K, $$2);
   }
}
