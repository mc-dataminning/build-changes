import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class ccu extends cda<bsq> {
   protected abstract boolean a(bsq var1, bsq var2);

   protected abstract cbu<bsq> b();

   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<bsq> b(bsq $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cbw> a(bsq $$0) {
      return $$0.dS().c(cbu.h);
   }
}
