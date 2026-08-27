import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bux extends bvf {
   public static final float a = 10.0F;

   @Override
   protected boolean a(blg $$0, blg $$1) {
      return !$$0.dP().a(buh.T) && bvl.c($$0, $$1) && byg.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(blg $$0, blg $$1) {
      List<UUID> $$2 = $$0.dP().c(buh.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected buh<blg> b() {
      return buh.B;
   }
}
