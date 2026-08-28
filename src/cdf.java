import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdf extends cdl<btb> {
   protected abstract boolean a(btb var1, btb var2);

   protected abstract ccf<btb> b();

   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      $$1.dU().a(this.b(), this.b($$1));
   }

   private Optional<btb> b(btb $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cch> a(btb $$0) {
      return $$0.dU().c(ccf.h);
   }
}
