import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class btf extends btl<bjg> {
   protected abstract boolean a(bjg var1, bjg var2);

   protected abstract bsh<bjg> b();

   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(akr $$0, bjg $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bjg> b(bjg $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bsj> a(bjg $$0) {
      return $$0.dN().c(bsh.h);
   }
}
