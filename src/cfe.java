import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cfe extends cfk<bva> {
   protected abstract boolean a(bva var1, bva var2);

   protected abstract cee<bva> b();

   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      $$1.ed().a(this.b(), this.b($$1));
   }

   private Optional<bva> b(bva $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ceg> a(bva $$0) {
      return $$0.ed().c(cee.h);
   }
}
