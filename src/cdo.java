import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cdo extends cdu<btk> {
   protected abstract boolean a(btk var1, btk var2);

   protected abstract cco<btk> b();

   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<btk> b(btk $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccq> a(btk $$0) {
      return $$0.dS().c(cco.h);
   }
}
