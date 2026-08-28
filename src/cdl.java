import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdl extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.x, ccr.y);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      bup<?> $$2 = $$1.dS();
      brl $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(ccr.x, $$1.eC());
         bss $$4 = $$3.d();
         if ($$4 instanceof btn) {
            $$2.a(ccr.y, (btn)$$4);
         }
      } else {
         $$2.b(ccr.x);
      }

      $$2.c(ccr.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(ccr.y);
         }
      });
   }
}
