import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class byh extends byn<bog> {
   protected abstract boolean a(bog var1, bog var2);

   protected abstract bxh<bog> b();

   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<bog> b(bog $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bxj> a(bog $$0) {
      return $$0.dO().c(bxh.h);
   }
}
