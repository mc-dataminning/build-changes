import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdk extends cdt {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btp $$0, btp $$1) {
      return !$$0.dS().a(cct.U) && cdz.c($$0, $$1) && cgz.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btp $$0, btp $$1) {
      List<UUID> $$2 = $$0.dS().c(cct.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected cct<btp> b() {
      return cct.B;
   }
}
