import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cfx extends cgq<bvb> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.K, cfk.h);
   }

   protected void a(ash $$0, bvb $$1) {
      $$1.ec().c(cfk.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bvb $$0, cfm $$1) {
      Optional<bvb> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bvb.class::cast);
      $$0.ec().a(cfk.K, $$2);
   }
}
