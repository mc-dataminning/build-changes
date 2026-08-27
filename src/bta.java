import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bta extends btg<bjb> {
   protected abstract boolean a(bjb var1, bjb var2);

   protected abstract bsc<bjb> b();

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      $$1.dM().a(this.b(), this.b($$1));
   }

   private Optional<bjb> b(bjb $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bse> a(bjb $$0) {
      return $$0.dM().c(bsc.h);
   }
}
