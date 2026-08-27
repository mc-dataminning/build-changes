import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class buu extends bvl<bkl> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.J, buh.h);
   }

   protected void a(ame $$0, bkl $$1) {
      $$1.dP().c(buh.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bkl $$0, buj $$1) {
      Optional<bkl> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.n_()).map(bkl.class::cast);
      $$0.dP().a(buh.J, $$2);
   }
}
