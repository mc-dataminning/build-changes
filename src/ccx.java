import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ccx extends cdg {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btc $$0, btc $$1) {
      return !$$0.dV().a(ccg.U) && cdm.c($$0, $$1) && cgm.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btc $$0, btc $$1) {
      List<UUID> $$2 = $$0.dV().c(ccg.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cB());
   }

   @Override
   protected ccg<btc> b() {
      return ccg.B;
   }
}
