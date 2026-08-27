import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cbb extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.x, cah.y);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      bsf<?> $$2 = $$1.dQ();
      bpj $$3 = $$1.eA();
      if ($$3 != null) {
         $$2.a(cah.x, $$1.eA());
         bql $$4 = $$3.d();
         if ($$4 instanceof bre) {
            $$2.a(cah.y, (bre)$$4);
         }
      } else {
         $$2.b(cah.x);
      }

      $$2.c(cah.y).ifPresent($$2x -> {
         if (!$$2x.bB() || $$2x.dN() != $$0) {
            $$2.b(cah.y);
         }
      });
   }
}
