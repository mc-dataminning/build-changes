import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cay extends cbh {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bre $$0, bre $$1) {
      return !$$0.dQ().a(cah.U) && cbn.c($$0, $$1) && cen.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bre $$0, bre $$1) {
      List<UUID> $$2 = $$0.dQ().c(cah.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cx());
   }

   @Override
   protected cah<bre> b() {
      return cah.B;
   }
}
