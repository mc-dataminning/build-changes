import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cga extends cgj {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ash $$0, bwf $$1, bwf $$2) {
      return !$$1.eb().a(cfj.U) && cgp.c($$0, $$1, $$2) && cjq.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bwf $$0, bwf $$1) {
      List<UUID> $$2 = $$0.eb().c(cfj.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cfj<bwf> b() {
      return cfj.B;
   }
}
