import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class ced extends cew<btk> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.K, cdq.h);
   }

   protected void a(arj $$0, btk $$1) {
      $$1.dY().c(cdq.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(btk $$0, cds $$1) {
      Optional<btk> $$2 = $$1.a($$1x -> $$1x.ao() == $$0.ao() && !$$1x.p_()).map(btk.class::cast);
      $$0.dY().a(cdq.K, $$2);
   }
}
