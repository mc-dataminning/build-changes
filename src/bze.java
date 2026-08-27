import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bze extends bzx<bor> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.K, byr.h);
   }

   protected void a(apf $$0, bor $$1) {
      $$1.dP().c(byr.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bor $$0, byt $$1) {
      Optional<bor> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bor.class::cast);
      $$0.dP().a(byr.K, $$2);
   }
}
