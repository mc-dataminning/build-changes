import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bxy extends byh {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bog $$0, bog $$1) {
      return !$$0.dO().a(bxh.U) && byn.c($$0, $$1) && cbl.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bog $$0, bog $$1) {
      List<UUID> $$2 = $$0.dO().c(bxh.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bxh<bog> b() {
      return bxh.B;
   }
}
