import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cfl extends cfr<bvh> {
   protected abstract boolean a(ard var1, bvh var2, bvh var3);

   protected abstract cel<bvh> b();

   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ard $$0, bvh $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bvh> c(ard $$0, bvh $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cen> a(bvh $$0) {
      return $$0.eb().c(cel.h);
   }
}
