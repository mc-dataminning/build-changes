import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bwg extends bwm<bmf> {
   protected abstract boolean a(bmf var1, bmf var2);

   protected abstract bvh<bmf> b();

   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<bmf> b(bmf $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bvj> a(bmf $$0) {
      return $$0.dO().c(bvh.h);
   }
}
