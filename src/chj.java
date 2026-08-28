import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class chj extends cic<bwj> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.L, cgw.h);
   }

   protected void a(ars $$0, bwj $$1) {
      $$1.ec().c(cgw.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bwj $$0, cgy $$1) {
      Optional<bwj> $$2 = $$1.a($$1x -> $$1x.an() == $$0.an() && !$$1x.n_()).map(bwj.class::cast);
      $$0.ec().a(cgw.L, $$2);
   }
}
