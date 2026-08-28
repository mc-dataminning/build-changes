import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class cds extends cdy<bto> {
   protected abstract boolean a(bto var1, bto var2);

   protected abstract ccs<bto> b();

   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(are $$0, bto $$1) {
      $$1.dS().a(this.b(), this.b($$1));
   }

   private Optional<bto> b(bto $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<ccu> a(bto $$0) {
      return $$0.dS().c(ccs.h);
   }
}
