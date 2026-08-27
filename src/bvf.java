import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class bvf extends bvl<blg> {
   protected abstract boolean a(blg var1, blg var2);

   protected abstract buh<blg> b();

   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<blg> b(blg $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<buj> a(blg $$0) {
      return $$0.dP().c(buh.h);
   }
}
