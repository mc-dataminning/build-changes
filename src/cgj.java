import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgj extends cgp<bwf> {
   protected abstract boolean a(ash var1, bwf var2, bwf var3);

   protected abstract cfj<bwf> b();

   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bwf> c(ash $$0, bwf $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfl> a(bwf $$0) {
      return $$0.eb().c(cfj.h);
   }
}
