import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bwe extends bwm {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bml $$0, bml $$1) {
      return !$$0.dO().a(bvn.T) && bws.c($$0, $$1) && bzn.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bml $$0, bml $$1) {
      List<UUID> $$2 = $$0.dO().c(bvn.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bvn<bml> b() {
      return bvn.B;
   }
}
