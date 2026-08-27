import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bwl extends bwr<bmk> {
   protected abstract boolean a(bmk var1, bmk var2);

   protected abstract bvm<bmk> b();

   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      $$1.dO().a(this.b(), this.b($$1));
   }

   private Optional<bmk> b(bmk $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bvo> a(bmk $$0) {
      return $$0.dO().c(bvm.h);
   }
}
