import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfw extends cgi<bvy> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.x, cfc.y);
   }

   @Override
   protected void a(ard $$0, bvy $$1) {
      bxa<?> $$2 = $$1.ea();
      btp $$3 = $$1.eG();
      if ($$3 != null) {
         $$2.a(cfc.x, $$1.eG());
         bva $$4 = $$3.d();
         if ($$4 instanceof bvy) {
            $$2.a(cfc.y, (bvy)$$4);
         }
      } else {
         $$2.b(cfc.x);
      }

      $$2.c(cfc.y).ifPresent($$2x -> {
         if (!$$2x.bJ() || $$2x.dU() != $$0) {
            $$2.b(cfc.y);
         }
      });
   }
}
