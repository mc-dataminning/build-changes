import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cds extends cdy<btn> {
   protected abstract boolean a(btn var1, btn var2);

   protected abstract ccs<btn> b();

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      $$1.dT().a(this.b(), this.b($$1));
   }

   private Optional<btn> b(btn $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccu> a(btn $$0) {
      return $$0.dT().c(ccs.h);
   }
}
