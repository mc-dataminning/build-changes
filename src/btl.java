import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class btl extends btr<bjm> {
   protected abstract boolean a(bjm var1, bjm var2);

   protected abstract bsn<bjm> b();

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bjm> b(bjm $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bsp> a(bjm $$0) {
      return $$0.dN().c(bsn.h);
   }
}
