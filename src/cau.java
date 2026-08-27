import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cau extends cbn<bqf> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.K, cah.h);
   }

   protected void a(aqe $$0, bqf $$1) {
      $$1.dQ().c(cah.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bqf $$0, caj $$1) {
      Optional<bqf> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.p_()).map(bqf.class::cast);
      $$0.dQ().a(cah.K, $$2);
   }
}
