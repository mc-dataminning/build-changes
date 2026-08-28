import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cer extends cfk<btv> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.K, cee.h);
   }

   protected void a(arn $$0, btv $$1) {
      $$1.ed().c(cee.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(btv $$0, ceg $$1) {
      Optional<btv> $$2 = $$1.a($$1x -> $$1x.ar() == $$0.ar() && !$$1x.p_()).map(btv.class::cast);
      $$0.ed().a(cee.K, $$2);
   }
}
