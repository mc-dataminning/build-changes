import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class chu extends cin<bwu> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.L, chh.h);
   }

   protected void a(asb $$0, bwu $$1) {
      $$1.ec().c(chh.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bwu $$0, chj $$1) {
      Optional<bwu> $$2 = $$1.a($$1x -> $$1x.an() == $$0.an() && !$$1x.e_()).map(bwu.class::cast);
      $$0.ec().a(chh.L, $$2);
   }
}
