import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class ccs extends ccy<bso> {
   protected abstract boolean a(bso var1, bso var2);

   protected abstract cbs<bso> b();

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<bso> b(bso $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cbu> a(bso $$0) {
      return $$0.dS().c(cbs.h);
   }
}
