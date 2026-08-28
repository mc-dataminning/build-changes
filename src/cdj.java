import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdj extends cds {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return !$$0.dU().a(ccs.U) && cdy.c($$0, $$1) && cgy.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btn $$0, btn $$1) {
      List<UUID> $$2 = $$0.dU().c(ccs.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cA());
   }

   @Override
   protected ccs<btn> b() {
      return ccs.B;
   }
}
