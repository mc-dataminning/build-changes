import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class byc extends byl {
   public static final float a = 10.0F;

   @Override
   protected boolean a(boi $$0, boi $$1) {
      return !$$0.dO().a(bxl.U) && byr.c($$0, $$1) && cbp.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(boi $$0, boi $$1) {
      List<UUID> $$2 = $$0.dO().c(bxl.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bxl<boi> b() {
      return bxl.B;
   }
}
