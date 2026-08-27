import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cci extends ccr {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return !$$0.dZ().a(cbr.U) && ccx.c($$0, $$1) && cfy.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bso $$0, bso $$1) {
      List<UUID> $$2 = $$0.dZ().c(cbr.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cE());
   }

   @Override
   protected cbr<bso> b() {
      return cbr.B;
   }
}
