import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bud extends buo<bkj> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.x, btk.y);
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      blj<?> $$2 = $$1.dN();
      bir $$3 = $$1.ew();
      if ($$3 != null) {
         $$2.a(btk.x, $$1.ew());
         bjt $$4 = $$3.d();
         if ($$4 instanceof bkj) {
            $$2.a(btk.y, (bkj)$$4);
         }
      } else {
         $$2.b(btk.x);
      }

      $$2.c(btk.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dL() != $$0) {
            $$2.b(btk.y);
         }
      });
   }
}
