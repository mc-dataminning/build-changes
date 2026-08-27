import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bzm extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.x, bys.y);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      bqq<?> $$2 = $$1.dP();
      bnw $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(bys.x, $$1.ez());
         box $$4 = $$3.d();
         if ($$4 instanceof bpp) {
            $$2.a(bys.y, (bpp)$$4);
         }
      } else {
         $$2.b(bys.x);
      }

      $$2.c(bys.y).ifPresent($$2x -> {
         if (!$$2x.bA() || $$2x.dM() != $$0) {
            $$2.b(bys.y);
         }
      });
   }
}
