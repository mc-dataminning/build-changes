import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class chl extends chr<bxj> {
   protected abstract boolean a(arq var1, bxj var2, bxj var3);

   protected abstract cgl<bxj> b();

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bxj> c(arq $$0, bxj $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cgn> a(bxj $$0) {
      return $$0.eb().c(cgl.h);
   }
}
