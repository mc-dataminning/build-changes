import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class caw extends cbc<bqt> {
   protected abstract boolean a(bqt var1, bqt var2);

   protected abstract bzw<bqt> b();

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(apu $$0, bqt $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<bqt> b(bqt $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bzy> a(bqt $$0) {
      return $$0.dP().c(bzw.h);
   }
}
