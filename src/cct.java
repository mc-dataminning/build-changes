import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cct extends cdc {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bsy $$0, bsy $$1) {
      return !$$0.dT().a(ccc.U) && cdi.c($$0, $$1) && cgi.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bsy $$0, bsy $$1) {
      List<UUID> $$2 = $$0.dT().c(ccc.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected ccc<bsy> b() {
      return ccc.B;
   }
}
