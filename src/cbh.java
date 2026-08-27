import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cbh extends cbn<bre> {
   protected abstract boolean a(bre var1, bre var2);

   protected abstract cah<bre> b();

   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      $$1.dQ().a(this.b(), this.b($$1));
   }

   private Optional<bre> b(bre $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<caj> a(bre $$0) {
      return $$0.dQ().c(cah.h);
   }
}
