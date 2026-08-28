import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cgs extends chb {
   public static final float a = 10.0F;

   @Override
   protected boolean a(aro $$0, bwz $$1, bwz $$2) {
      return !$$1.eb().a(cgb.V) && chh.c($$0, $$1, $$2) && ckl.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bwz $$0, bwz $$1) {
      List<UUID> $$2 = $$0.eb().c(cgb.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cgb<bwz> b() {
      return cgb.C;
   }
}
