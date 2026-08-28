import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdt extends cdz<btp> {
   protected abstract boolean a(btp var1, btp var2);

   protected abstract cct<btp> b();

   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<btp> b(btp $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccv> a(btp $$0) {
      return $$0.dS().c(cct.h);
   }
}
