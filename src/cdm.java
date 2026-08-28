import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdm extends cdy<bto> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.x, ccs.y);
   }

   @Override
   protected void a(are $$0, bto $$1) {
      buq<?> $$2 = $$1.dS();
      brm $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(ccs.x, $$1.eC());
         bst $$4 = $$3.d();
         if ($$4 instanceof bto) {
            $$2.a(ccs.y, (bto)$$4);
         }
      } else {
         $$2.b(ccs.x);
      }

      $$2.c(ccs.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(ccs.y);
         }
      });
   }
}
