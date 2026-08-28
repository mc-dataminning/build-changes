import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cfj extends cfp<bvf> {
   protected abstract boolean a(arc var1, bvf var2, bvf var3);

   protected abstract cej<bvf> b();

   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bvf> c(arc $$0, bvf $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cel> a(bvf $$0) {
      return $$0.ec().c(cej.h);
   }
}
