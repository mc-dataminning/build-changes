import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bvw extends bwc<blv> {
   protected abstract boolean a(blv var1, blv var2);

   protected abstract bux<blv> b();

   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<blv> b(blv $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<buz> a(blv $$0) {
      return $$0.dO().c(bux.h);
   }
}
