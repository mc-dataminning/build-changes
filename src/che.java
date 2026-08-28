import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class che extends chk<bxc> {
   protected abstract boolean a(arq var1, bxc var2, bxc var3);

   protected abstract cge<bxc> b();

   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bxc> c(arq $$0, bxc $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cgg> a(bxc $$0) {
      return $$0.eb().c(cge.h);
   }
}
