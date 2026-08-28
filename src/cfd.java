import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfd extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.x, cej.y);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      bwh<?> $$2 = $$1.ec();
      bsz $$3 = $$1.eG();
      if ($$3 != null) {
         $$2.a(cej.x, $$1.eG());
         buj $$4 = $$3.d();
         if ($$4 instanceof bvf) {
            $$2.a(cej.y, (bvf)$$4);
         }
      } else {
         $$2.b(cej.x);
      }

      $$2.c(cej.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dW() != $$0) {
            $$2.b(cej.y);
         }
      });
   }
}
