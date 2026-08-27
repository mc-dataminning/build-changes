import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bus extends bvd<bky> {
   @Override
   public Set<btz<?>> a() {
      return ImmutableSet.of(btz.x, btz.y);
   }

   @Override
   protected void a(ama $$0, bky $$1) {
      bly<?> $$2 = $$1.dN();
      bjg $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(btz.x, $$1.ew());
         bki $$4 = $$3.d();
         if ($$4 instanceof bky) {
            $$2.a(btz.y, (bky)$$4);
         }
      } else {
         $$2.b(btz.x);
      }

      $$2.c(btz.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dL() != $$0) {
            $$2.b(btz.y);
         }
      });
   }
}
