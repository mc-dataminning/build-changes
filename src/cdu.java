import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdu extends cea<btq> {
   protected abstract boolean a(btq var1, btq var2);

   protected abstract ccu<btq> b();

   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<btq> b(btq $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccw> a(btq $$0) {
      return $$0.dS().c(ccu.h);
   }
}
