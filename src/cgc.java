import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgc extends cgi<bvy> {
   protected abstract boolean a(ard var1, bvy var2, bvy var3);

   protected abstract cfc<bvy> b();

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      $$1.ea().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bvy> c(ard $$0, bvy $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfe> a(bvy $$0) {
      return $$0.ea().c(cfc.h);
   }
}
