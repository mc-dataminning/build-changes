import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bva extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.x, buh.y);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      bmg<?> $$2 = $$1.dP();
      bjo $$3 = $$1.ey();
      if ($$3 != null) {
         $$2.a(buh.x, $$1.ey());
         bkq $$4 = $$3.d();
         if ($$4 instanceof blg) {
            $$2.a(buh.y, (blg)$$4);
         }
      } else {
         $$2.b(buh.x);
      }

      $$2.c(buh.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dN() != $$0) {
            $$2.b(buh.y);
         }
      });
   }
}
