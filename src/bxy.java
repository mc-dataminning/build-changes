import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bxy extends byr<bnl> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.K, bxl.h);
   }

   protected void a(aow $$0, bnl $$1) {
      $$1.dO().c(bxl.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bnl $$0, bxn $$1) {
      Optional<bnl> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bnl.class::cast);
      $$0.dO().a(bxl.K, $$2);
   }
}
