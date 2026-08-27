import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bwh extends bwq {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bmo $$0, bmo $$1) {
      return !$$0.dN().a(bvq.U) && bww.c($$0, $$1) && bzu.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bmo $$0, bmo $$1) {
      List<UUID> $$2 = $$0.dN().c(bvq.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bvq<bmo> b() {
      return bvq.B;
   }
}
