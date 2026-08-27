import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bzs extends bzy<bpp> {
   protected abstract boolean a(bpp var1, bpp var2);

   protected abstract bys<bpp> b();

   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<bpp> b(bpp $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<byu> a(bpp $$0) {
      return $$0.dP().c(bys.h);
   }
}
