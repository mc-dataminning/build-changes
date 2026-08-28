import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cib extends cin<byf> {
   @Override
   public Set<chh<?>> a() {
      return ImmutableSet.of(chh.y, chh.z);
   }

   @Override
   protected void a(asb $$0, byf $$1) {
      bzf<?> $$2 = $$1.ec();
      bvt $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(chh.y, $$1.eI());
         bxe $$4 = $$3.d();
         if ($$4 instanceof byf) {
            $$2.a(chh.z, (byf)$$4);
         }
      } else {
         $$2.b(chh.y);
      }

      $$2.c(chh.z).ifPresent($$2x -> {
         if (!$$2x.bJ() || $$2x.dV() != $$0) {
            $$2.b(chh.z);
         }
      });
   }
}
