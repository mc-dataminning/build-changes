import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class ccd extends ccj<bsa> {
   protected abstract boolean a(bsa var1, bsa var2);

   protected abstract cbd<bsa> b();

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqh $$0, bsa $$1) {
      $$1.dQ().a(this.b(), this.b($$1));
   }

   private Optional<bsa> b(bsa $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cbf> a(bsa $$0) {
      return $$0.dQ().c(cbd.h);
   }
}
