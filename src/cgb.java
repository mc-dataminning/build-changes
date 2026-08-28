import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cgb extends cgk {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ash $$0, bwg $$1, bwg $$2) {
      return !$$1.ec().a(cfk.U) && cgq.c($$0, $$1, $$2) && cjr.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bwg $$0, bwg $$1) {
      List<UUID> $$2 = $$0.ec().c(cfk.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cfk<bwg> b() {
      return cfk.B;
   }
}
