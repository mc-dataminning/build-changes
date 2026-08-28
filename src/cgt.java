import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgt extends cgz<bwr> {
   protected abstract boolean a(arn var1, bwr var2, bwr var3);

   protected abstract cft<bwr> b();

   @Override
   public Set<cft<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arn $$0, bwr $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bwr> c(arn $$0, bwr $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfv> a(bwr $$0) {
      return $$0.eb().c(cft.h);
   }
}
