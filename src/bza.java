import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bza extends bzg<box> {
   protected abstract boolean a(box var1, box var2);

   protected abstract bya<box> b();

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(apa $$0, box $$1) {
      $$1.dM().a(this.b(), this.b($$1));
   }

   private Optional<box> b(box $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<byc> a(box $$0) {
      return $$0.dM().c(bya.h);
   }
}
