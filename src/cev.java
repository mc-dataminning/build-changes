import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cev extends cfo<btz> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.K, cei.h);
   }

   protected void a(arq $$0, btz $$1) {
      $$1.ee().c(cei.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(btz $$0, cek $$1) {
      Optional<btz> $$2 = $$1.a($$1x -> $$1x.ar() == $$0.ar() && !$$1x.p_()).map(btz.class::cast);
      $$0.ee().a(cei.K, $$2);
   }
}
