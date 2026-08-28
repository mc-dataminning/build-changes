import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cfs extends cgl<buw> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.K, cff.h);
   }

   protected void a(ash $$0, buw $$1) {
      $$1.eb().c(cff.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(buw $$0, cfh $$1) {
      Optional<buw> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(buw.class::cast);
      $$0.eb().a(cff.K, $$2);
   }
}
