import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class btd extends btl {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bjm $$0, bjm $$1) {
      return !$$0.dN().a(bsn.T) && btr.c($$0, $$1) && bwm.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bjm $$0, bjm $$1) {
      List<UUID> $$2 = $$0.dN().c(bsn.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bsn<bjm> b() {
      return bsn.B;
   }
}
