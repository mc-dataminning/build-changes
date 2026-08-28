import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cei extends ceo<buf> {
   protected abstract boolean a(buf var1, buf var2);

   protected abstract cdi<buf> b();

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      $$1.dX().a(this.b(), this.b($$1));
   }

   private Optional<buf> b(buf $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cdk> a(buf $$0) {
      return $$0.dX().c(cdi.h);
   }
}
