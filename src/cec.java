import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cec extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.x, cdi.y);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      bvg<?> $$2 = $$1.dX();
      bsb $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cdi.x, $$1.eC());
         btj $$4 = $$3.d();
         if ($$4 instanceof buf) {
            $$2.a(cdi.y, (buf)$$4);
         }
      } else {
         $$2.b(cdi.x);
      }

      $$2.c(cdi.y).ifPresent($$2x -> {
         if (!$$2x.bI() || $$2x.dS() != $$0) {
            $$2.b(cdi.y);
         }
      });
   }
}
