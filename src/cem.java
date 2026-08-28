import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cem extends cff<btq> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.K, cdz.h);
   }

   protected void a(arm $$0, btq $$1) {
      $$1.ed().c(cdz.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(btq $$0, ceb $$1) {
      Optional<btq> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.p_()).map(btq.class::cast);
      $$0.ed().a(cdz.K, $$2);
   }
}
