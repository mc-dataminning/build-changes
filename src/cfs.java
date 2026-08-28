import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfs extends cgb {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arx $$0, bvx $$1, bvx $$2) {
      return !$$1.ec().a(cfb.U) && cgh.c($$0, $$1, $$2) && cji.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvx $$0, bvx $$1) {
      List<UUID> $$2 = $$0.ec().c(cfb.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cfb<bvx> b() {
      return cfb.B;
   }
}
