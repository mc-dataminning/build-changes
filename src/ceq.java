import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class ceq extends cew<bun> {
   protected abstract boolean a(bun var1, bun var2);

   protected abstract cdq<bun> b();

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      $$1.dY().a(this.b(), this.b($$1));
   }

   private Optional<bun> b(bun $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cds> a(bun $$0) {
      return $$0.dY().c(cdq.h);
   }
}
