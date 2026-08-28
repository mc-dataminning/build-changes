import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class chl extends cie<bwl> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.L, cgy.h);
   }

   protected void a(aru $$0, bwl $$1) {
      $$1.ec().c(cgy.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bwl $$0, cha $$1) {
      Optional<bwl> $$2 = $$1.a($$1x -> $$1x.an() == $$0.an() && !$$1x.n_()).map(bwl.class::cast);
      $$0.ec().a(cgy.L, $$2);
   }
}
