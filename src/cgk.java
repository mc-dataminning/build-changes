import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgk extends cgq<bwg> {
   protected abstract boolean a(ash var1, bwg var2, bwg var3);

   protected abstract cfk<bwg> b();

   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bwg> c(ash $$0, bwg $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfm> a(bwg $$0) {
      return $$0.ec().c(cfk.h);
   }
}
