import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdn extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.x, cct.y);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      bur<?> $$2 = $$1.dS();
      brn $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cct.x, $$1.eC());
         bsu $$4 = $$3.d();
         if ($$4 instanceof btp) {
            $$2.a(cct.y, (btp)$$4);
         }
      } else {
         $$2.b(cct.x);
      }

      $$2.c(cct.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(cct.y);
         }
      });
   }
}
