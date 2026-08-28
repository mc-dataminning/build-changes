import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdq extends cdw<btl> {
   protected abstract boolean a(btl var1, btl var2);

   protected abstract ccq<btl> b();

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      $$1.dU().a(this.b(), this.b($$1));
   }

   private Optional<btl> b(btl $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccs> a(btl $$0) {
      return $$0.dU().c(ccq.h);
   }
}
