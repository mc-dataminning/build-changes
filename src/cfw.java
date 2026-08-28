import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfw extends cgf {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ash $$0, bwb $$1, bwb $$2) {
      return !$$1.eb().a(cff.U) && cgl.c($$0, $$1, $$2) && cjm.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bwb $$0, bwb $$1) {
      List<UUID> $$2 = $$0.eb().c(cff.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cff<bwb> b() {
      return cff.B;
   }
}
