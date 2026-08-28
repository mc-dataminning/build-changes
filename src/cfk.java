import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cfk extends cfq<bvg> {
   protected abstract boolean a(arc var1, bvg var2, bvg var3);

   protected abstract cek<bvg> b();

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(arc $$0, bvg $$1) {
      $$1.ec().a(this.b(), this.c($$0, $$1));
   }

   private Optional<bvg> c(arc $$0, bvg $$1) {
      return this.a($$1).flatMap($$2 -> $$2.a($$2x -> this.a($$0, $$1, $$2x)));
   }

   protected Optional<cem> a(bvg $$0) {
      return $$0.ec().c(cek.h);
   }
}
