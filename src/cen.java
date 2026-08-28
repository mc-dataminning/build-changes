import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cen extends cet<buk> {
   protected abstract boolean a(buk var1, buk var2);

   protected abstract cdn<buk> b();

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      $$1.dX().a(this.b(), this.b($$1));
   }

   private Optional<buk> b(buk $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<cdp> a(buk $$0) {
      return $$0.dX().c(cdn.h);
   }
}
