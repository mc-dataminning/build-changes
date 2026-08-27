import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bss extends bta {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bjb $$0, bjb $$1) {
      return !$$0.dM().a(bsc.T) && btg.c($$0, $$1) && bwb.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bjb $$0, bjb $$1) {
      List<UUID> $$2 = $$0.dM().c(bsc.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bsc<bjb> b() {
      return bsc.B;
   }
}
