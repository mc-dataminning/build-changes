import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bta extends btr<bir> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.J, bsn.h);
   }

   protected void a(akt $$0, bir $$1) {
      $$1.dN().c(bsn.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bir $$0, bsp $$1) {
      Optional<bir> $$2 = $$1.a($$1x -> $$1x.ag() == $$0.ag() && !$$1x.m_()).map(bir.class::cast);
      $$0.dN().a(bsn.J, $$2);
   }
}
