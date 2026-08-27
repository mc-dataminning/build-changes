import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bvk extends bvq<bll> {
   protected abstract boolean a(bll var1, bll var2);

   protected abstract bum<bll> b();

   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<bll> b(bll $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<buo> a(bll $$0) {
      return $$0.dP().c(bum.h);
   }
}
