import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ccj extends ccs {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return !$$0.dS().a(cbs.U) && ccy.c($$0, $$1) && cfy.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bso $$0, bso $$1) {
      List<UUID> $$2 = $$0.dS().c(cbs.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected cbs<bso> b() {
      return cbs.B;
   }
}
