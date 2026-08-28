import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cgx extends chg {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arq $$0, bxe $$1, bxe $$2) {
      return !$$1.ec().a(cgg.V) && chm.c($$0, $$1, $$2) && ckv.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bxe $$0, bxe $$1) {
      List<UUID> $$2 = $$0.ec().c(cgg.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cgg<bxe> b() {
      return cgg.C;
   }
}
