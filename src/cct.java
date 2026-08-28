import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cct extends cdm<bsb> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.K, ccg.h);
   }

   protected void a(aqm $$0, bsb $$1) {
      $$1.dV().c(ccg.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bsb $$0, cci $$1) {
      Optional<bsb> $$2 = $$1.a($$1x -> $$1x.am() == $$0.am() && !$$1x.o_()).map(bsb.class::cast);
      $$0.dV().a(ccg.K, $$2);
   }
}
