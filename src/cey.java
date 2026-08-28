import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cey extends cfr<buc> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.K, cel.h);
   }

   protected void a(arp $$0, buc $$1) {
      $$1.eb().c(cel.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(buc $$0, cen $$1) {
      Optional<buc> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(buc.class::cast);
      $$0.eb().a(cel.K, $$2);
   }
}
