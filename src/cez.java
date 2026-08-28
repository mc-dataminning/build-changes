import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cez extends cff<buv> {
   protected abstract boolean a(buv var1, buv var2);

   protected abstract cdz<buv> b();

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      $$1.ed().a(this.b(), this.b($$1));
   }

   private Optional<buv> b(buv $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ceb> a(buv $$0) {
      return $$0.ed().c(cdz.h);
   }
}
