import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bzr extends bzx<bpo> {
   protected abstract boolean a(bpo var1, bpo var2);

   protected abstract byr<bpo> b();

   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<bpo> b(bpo $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<byt> a(bpo $$0) {
      return $$0.dP().c(byr.h);
   }
}
