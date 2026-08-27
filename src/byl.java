import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class byl extends byr<boi> {
   protected abstract boolean a(boi var1, boi var2);

   protected abstract bxl<boi> b();

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<boi> b(boi $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bxn> a(boi $$0) {
      return $$0.dO().c(bxl.h);
   }
}
