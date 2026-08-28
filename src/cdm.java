import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdm extends cdy<btn> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.x, ccs.y);
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      buq<?> $$2 = $$1.dU();
      brk $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(ccs.x, $$1.ez());
         bsr $$4 = $$3.d();
         if ($$4 instanceof btn) {
            $$2.a(ccs.y, (btn)$$4);
         }
      } else {
         $$2.b(ccs.x);
      }

      $$2.c(ccs.y).ifPresent($$2x -> {
         if (!$$2x.bE() || $$2x.dP() != $$0) {
            $$2.b(ccs.y);
         }
      });
   }
}
