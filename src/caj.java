import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class caj extends cbc<bpu> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.K, bzw.h);
   }

   protected void a(apu $$0, bpu $$1) {
      $$1.dP().c(bzw.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bpu $$0, bzy $$1) {
      Optional<bpu> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.p_()).map(bpu.class::cast);
      $$0.dP().a(bzw.K, $$2);
   }
}
