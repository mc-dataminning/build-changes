import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cft extends cgc {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ard $$0, bvy $$1, bvy $$2) {
      return !$$1.ea().a(cfc.U) && cgi.c($$0, $$1, $$2) && cjm.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvy $$0, bvy $$1) {
      List<UUID> $$2 = $$0.ea().c(cfc.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cF());
   }

   @Override
   protected cfc<bvy> b() {
      return cfc.B;
   }
}
