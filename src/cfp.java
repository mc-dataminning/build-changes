import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cfp extends cgi<buq> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.K, cfc.h);
   }

   protected void a(ard $$0, buq $$1) {
      $$1.ea().c(cfc.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(buq $$0, cfe $$1) {
      Optional<buq> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.n_()).map(buq.class::cast);
      $$0.ea().a(cfc.K, $$2);
   }
}
