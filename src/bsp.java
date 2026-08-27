import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bsp extends bsx {
   public static final float a = 10.0F;

   @Override
   protected boolean a(biy $$0, biy $$1) {
      return !$$0.dM().a(brz.T) && btd.c($$0, $$1) && bvy.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(biy $$0, biy $$1) {
      List<UUID> $$2 = $$0.dM().c(brz.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected brz<biy> b() {
      return brz.B;
   }
}
