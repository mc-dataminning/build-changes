import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cfo extends cgh<bus> {
   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(cfb.K, cfb.h);
   }

   protected void a(arx $$0, bus $$1) {
      $$1.ec().c(cfb.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bus $$0, cfd $$1) {
      Optional<bus> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bus.class::cast);
      $$0.ec().a(cfb.K, $$2);
   }
}
