import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfc extends cfl {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arp $$0, bvh $$1, bvh $$2) {
      return !$$1.eb().a(cel.U) && cfr.c($$0, $$1, $$2) && cis.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvh $$0, bvh $$1) {
      List<UUID> $$2 = $$0.eb().c(cel.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cel<bvh> b() {
      return cel.B;
   }
}
