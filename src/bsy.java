import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bsy extends bte<biy> {
   protected abstract boolean a(biy var1, biy var2);

   protected abstract bsa<biy> b();

   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      $$1.dM().a(this.b(), this.b($$1));
   }

   private Optional<biy> b(biy $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bsc> a(biy $$0) {
      return $$0.dM().c(bsa.h);
   }
}
