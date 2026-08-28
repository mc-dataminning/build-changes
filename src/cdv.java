import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdv extends ceb<btr> {
   protected abstract boolean a(btr var1, btr var2);

   protected abstract ccv<btr> b();

   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<btr> b(btr $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccx> a(btr $$0) {
      return $$0.dS().c(ccv.h);
   }
}
