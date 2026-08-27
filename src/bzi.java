import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bzi extends bzr {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bpo $$0, bpo $$1) {
      return !$$0.dP().a(byr.U) && bzx.c($$0, $$1) && ccv.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bpo $$0, bpo $$1) {
      List<UUID> $$2 = $$0.dP().c(byr.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected byr<bpo> b() {
      return byr.B;
   }
}
