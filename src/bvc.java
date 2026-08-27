import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bvc extends bvk {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bll $$0, bll $$1) {
      return !$$0.dP().a(bum.T) && bvq.c($$0, $$1) && byl.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bll $$0, bll $$1) {
      List<UUID> $$2 = $$0.dP().c(bum.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bum<bll> b() {
      return bum.B;
   }
}
