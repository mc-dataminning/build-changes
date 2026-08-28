import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class chy extends cie<bxw> {
   protected abstract boolean a(aru var1, bxw var2, bxw var3);

   protected abstract cgy<bxw> b();

   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bxw> c(aru $$0, bxw $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cha> a(bxw $$0) {
      return $$0.ec().c(cgy.h);
   }
}
