import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bsz extends bth {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bji $$0, bji $$1) {
      return !$$0.dN().a(bsj.T) && btn.c($$0, $$1) && bwi.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bji $$0, bji $$1) {
      List<UUID> $$2 = $$0.dN().c(bsj.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bsj<bji> b() {
      return bsj.B;
   }
}
