import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bvo extends bvw {
   public static final float a = 10.0F;

   @Override
   protected boolean a(blv $$0, blv $$1) {
      return !$$0.dO().a(bux.T) && bwc.c($$0, $$1) && byx.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(blv $$0, blv $$1) {
      List<UUID> $$2 = $$0.dO().c(bux.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bux<blv> b() {
      return bux.B;
   }
}
