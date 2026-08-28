import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cfi extends cfo<bve> {
   protected abstract boolean a(bve var1, bve var2);

   protected abstract cei<bve> b();

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      $$1.ee().a(this.b(), this.b($$1));
   }

   private Optional<bve> b(bve $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cek> a(bve $$0) {
      return $$0.ee().c(cei.h);
   }
}
