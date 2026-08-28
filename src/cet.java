import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cet extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.x, cdz.y);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      bvx<?> $$2 = $$1.ed();
      bsp $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(cdz.x, $$1.eI());
         btz $$4 = $$3.d();
         if ($$4 instanceof buv) {
            $$2.a(cdz.y, (buv)$$4);
         }
      } else {
         $$2.b(cdz.x);
      }

      $$2.c(cdz.y).ifPresent($$2x -> {
         if (!$$2x.bM() || $$2x.dX() != $$0) {
            $$2.b(cdz.y);
         }
      });
   }
}
