import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cea extends cet<bth> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.K, cdn.h);
   }

   protected void a(arh $$0, bth $$1) {
      $$1.dX().c(cdn.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bth $$0, cdp $$1) {
      Optional<bth> $$2 = $$1.a($$1x -> $$1x.ao() == $$0.ao() && !$$1x.o_()).map(bth.class::cast);
      $$0.dX().a(cdn.K, $$2);
   }
}
