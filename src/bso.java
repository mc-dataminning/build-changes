import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bso extends bsw {
   public static final float a = 10.0F;

   @Override
   protected boolean a(biw $$0, biw $$1) {
      return !$$0.dM().a(bry.T) && btc.c($$0, $$1) && bvx.l($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(biw $$0, biw $$1) {
      List<UUID> $$2 = $$0.dM().c(bry.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bry<biw> b() {
      return bry.B;
   }
}
