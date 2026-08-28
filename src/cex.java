import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class cex extends cfq<bub> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.K, cek.h);
   }

   protected void a(ard $$0, bub $$1) {
      $$1.eb().c(cek.h).ifPresent($$1x -> this.a($$1, $$1x));
   }

   private void a(bub $$0, cem $$1) {
      Optional<bub> $$2 = $$1.a($$1x -> $$1x.aq() == $$0.aq() && !$$1x.e_()).map(bub.class::cast);
      $$0.eb().a(cek.K, $$2);
   }
}
