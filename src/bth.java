import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bth extends btn<bji> {
   protected abstract boolean a(bji var1, bji var2);

   protected abstract bsj<bji> b();

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aks $$0, bji $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bji> b(bji $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bsl> a(bji $$0) {
      return $$0.dN().c(bsj.h);
   }
}
