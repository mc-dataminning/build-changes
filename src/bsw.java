import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bsw extends btc<biw> {
   protected abstract boolean a(biw var1, biw var2);

   protected abstract bry<biw> b();

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      $$1.dM().a(this.b(), this.b($$1));
   }

   private Optional<biw> b(biw $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bsa> a(biw $$0) {
      return $$0.dM().c(bry.h);
   }
}
