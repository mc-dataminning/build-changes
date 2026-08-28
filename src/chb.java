import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class chb extends chh<bwz> {
   protected abstract boolean a(aro var1, bwz var2, bwz var3);

   protected abstract cgb<bwz> b();

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      $$1.eb().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bwz> c(aro $$0, bwz $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cgd> a(bwz $$0) {
      return $$0.eb().c(cgb.h);
   }
}
