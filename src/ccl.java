import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ccl extends ccu {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bsq $$0, bsq $$1) {
      return !$$0.dS().a(cbu.U) && cda.c($$0, $$1) && cga.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bsq $$0, bsq $$1) {
      List<UUID> $$2 = $$0.dS().c(cbu.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected cbu<bsq> b() {
      return cbu.B;
   }
}
