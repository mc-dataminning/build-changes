import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bvz extends bwr<blp> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.J, bvm.h);
   }

   protected void a(and $$0, blp $$1) {
      $$1.dO().c(bvm.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(blp $$0, bvo $$1) {
      Optional<blp> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(blp.class::cast);
      $$0.dO().a(bvm.J, $$2);
   }
}
