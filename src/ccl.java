import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccl extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.x, cbr.y);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      btp<?> $$2 = $$1.dZ();
      bqt $$3 = $$1.eK();
      if ($$3 != null) {
         $$2.a(cbr.x, $$1.eK());
         brv $$4 = $$3.d();
         if ($$4 instanceof bso) {
            $$2.a(cbr.y, (bso)$$4);
         }
      } else {
         $$2.b(cbr.x);
      }

      $$2.c(cbr.y).ifPresent($$2x -> {
         if (!$$2x.bI() || $$2x.dU() != $$0) {
            $$2.b(cbr.y);
         }
      });
   }
}
