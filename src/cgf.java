import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cgf extends cgl<bwb> {
   protected abstract boolean a(ash var1, bwb var2, bwb var3);

   protected abstract cff<bwb> b();

   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bwb> c(ash $$0, bwb $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cfh> a(bwb $$0) {
      return $$0.eb().c(cff.h);
   }
}
