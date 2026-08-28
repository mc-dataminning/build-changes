import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class chg extends chm<bxe> {
   protected abstract boolean a(arq var1, bxe var2, bxe var3);

   protected abstract cgg<bxe> b();

   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bxe> c(arq $$0, bxe $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cgi> a(bxe $$0) {
      return $$0.ec().c(cgg.h);
   }
}
