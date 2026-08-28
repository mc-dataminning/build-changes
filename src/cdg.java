import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdg extends cdm<btc> {
   protected abstract boolean a(btc var1, btc var2);

   protected abstract ccg<btc> b();

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      $$1.dV().a(this.b(), this.b($$1));
   }

   private Optional<btc> b(btc $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cci> a(btc $$0) {
      return $$0.dV().c(ccg.h);
   }
}
