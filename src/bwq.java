import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bwq extends bww<bmo> {
   protected abstract boolean a(bmo var1, bmo var2);

   protected abstract bvq<bmo> b();

   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      $$1.dN().a(this.b(), this.b($$1));
   }

   private Optional<bmo> b(bmo $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bvs> a(bmo $$0) {
      return $$0.dN().c(bvq.h);
   }
}
