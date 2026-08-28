import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgb extends cgh<bvx> {
   protected abstract boolean a(arx var1, bvx var2, bvx var3);

   protected abstract cfb<bvx> b();

   @Override
   public Set<cfb<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arx $$0, bvx $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bvx> c(arx $$0, bvx $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfd> a(bvx $$0) {
      return $$0.ec().c(cfb.h);
   }
}
