import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class bzf extends bzy<bos> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.K, bys.h);
   }

   protected void a(apf $$0, bos $$1) {
      $$1.dP().c(bys.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bos $$0, byu $$1) {
      Optional<bos> $$2 = $$1.a($$1x -> $$1x.ai() == $$0.ai() && !$$1x.o_()).map(bos.class::cast);
      $$0.dP().a(bys.K, $$2);
   }
}
