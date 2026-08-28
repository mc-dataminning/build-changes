import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class chn extends chw {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ars $$0, bxu $$1, bxu $$2) {
      return !$$1.ec().a(cgw.V) && cic.c($$0, $$1, $$2) && clh.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bxu $$0, bxu $$1) {
      List<UUID> $$2 = $$0.ec().c(cgw.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cgw<bxu> b() {
      return cgw.C;
   }
}
