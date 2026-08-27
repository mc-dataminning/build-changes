import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bui extends buo<bkj> {
   protected abstract boolean a(bkj var1, bkj var2);

   protected abstract btk<bkj> b();

   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bkj> b(bkj $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<btm> a(bkj $$0) {
      return $$0.dN().c(btk.h);
   }
}
