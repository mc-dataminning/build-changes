import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class byr extends bza {
   public static final float a = 10.0F;

   @Override
   protected boolean a(box $$0, box $$1) {
      return !$$0.dM().a(bya.U) && bzg.c($$0, $$1) && cce.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(box $$0, box $$1) {
      List<UUID> $$2 = $$0.dM().c(bya.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.ct());
   }

   @Override
   protected bya<box> b() {
      return bya.B;
   }
}
