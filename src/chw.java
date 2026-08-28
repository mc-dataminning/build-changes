import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class chw extends cic<bxu> {
   protected abstract boolean a(ars var1, bxu var2, bxu var3);

   protected abstract cgw<bxu> b();

   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bxu> c(ars $$0, bxu $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cgy> a(bxu $$0) {
      return $$0.ec().c(cgw.h);
   }
}
