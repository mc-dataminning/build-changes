import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bux extends bvd<bky> {
   protected abstract boolean a(bky var1, bky var2);

   protected abstract btz<bky> b();

   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bky> b(bky $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bub> a(bky $$0) {
      return $$0.dN().c(btz.h);
   }
}
