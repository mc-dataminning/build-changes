import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bwm extends bws<bml> {
   protected abstract boolean a(bml var1, bml var2);

   protected abstract bvn<bml> b();

   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(and $$0, bml $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<bml> b(bml $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bvp> a(bml $$0) {
      return $$0.dO().c(bvn.h);
   }
}
