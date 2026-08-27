import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bvy extends bwg {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bmf $$0, bmf $$1) {
      return !$$0.dO().a(bvh.T) && bwm.c($$0, $$1) && bzh.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bmf $$0, bmf $$1) {
      List<UUID> $$2 = $$0.dO().c(bvh.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bvh<bmf> b() {
      return bvh.B;
   }
}
