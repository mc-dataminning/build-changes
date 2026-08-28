import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cih extends cin<byf> {
   protected abstract boolean a(asb var1, byf var2, byf var3);

   protected abstract chh<byf> b();

   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<byf> c(asb $$0, byf $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<chj> a(byf $$0) {
      return $$0.ec().c(chh.h);
   }
}
