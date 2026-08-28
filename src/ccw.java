import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ccw extends cdf {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btb $$0, btb $$1) {
      return !$$0.dU().a(ccf.U) && cdl.c($$0, $$1) && cgl.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btb $$0, btb $$1) {
      List<UUID> $$2 = $$0.dU().c(ccf.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cA());
   }

   @Override
   protected ccf<btb> b() {
      return ccf.B;
   }
}
