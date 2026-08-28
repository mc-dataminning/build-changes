import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cha extends chm<bxe> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.y, cgg.z);
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      bye<?> $$2 = $$1.ec();
      buu $$3 = $$1.eI();
      if ($$3 != null) {
         $$2.a(cgg.y, $$1.eI());
         bwf $$4 = $$3.d();
         if ($$4 instanceof bxe) {
            $$2.a(cgg.z, (bxe)$$4);
         }
      } else {
         $$2.b(cgg.y);
      }

      $$2.c(cgg.z).ifPresent($$2x -> {
         if (!$$2x.bK() || $$2x.dV() != $$0) {
            $$2.b(cgg.z);
         }
      });
   }
}
