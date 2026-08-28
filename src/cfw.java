import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cfw extends cgp<bva> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.K, cfj.h);
   }

   protected void a(ash $$0, bva $$1) {
      $$1.ec().c(cfj.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bva $$0, cfl $$1) {
      Optional<bva> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bva.class::cast);
      $$0.ec().a(cfj.K, $$2);
   }
}
