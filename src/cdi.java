import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdi extends cdr {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return !$$0.dS().a(ccr.U) && cdx.c($$0, $$1) && cgx.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btn $$0, btn $$1) {
      List<UUID> $$2 = $$0.dS().c(ccr.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected ccr<btn> b() {
      return ccr.B;
   }
}
