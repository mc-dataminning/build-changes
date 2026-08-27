import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bsq extends bsy {
   public static final float a = 10.0F;

   @Override
   protected boolean a(biy $$0, biy $$1) {
      return !$$0.dM().a(bsa.T) && bte.c($$0, $$1) && bvz.l($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(biy $$0, biy $$1) {
      List<UUID> $$2 = $$0.dM().c(bsa.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bsa<biy> b() {
      return bsa.B;
   }
}
