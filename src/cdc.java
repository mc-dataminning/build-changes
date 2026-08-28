import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdc extends cdi<bsy> {
   protected abstract boolean a(bsy var1, bsy var2);

   protected abstract ccc<bsy> b();

   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      $$1.dT().a(this.b(), this.b($$1));
   }

   private Optional<bsy> b(bsy $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cce> a(bsy $$0) {
      return $$0.dT().c(ccc.h);
   }
}
