import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bwd extends bwl {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bmk $$0, bmk $$1) {
      return !$$0.dO().a(bvm.T) && bwr.c($$0, $$1) && bzm.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bmk $$0, bmk $$1) {
      List<UUID> $$2 = $$0.dO().c(bvm.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bvm<bmk> b() {
      return bvm.B;
   }
}
