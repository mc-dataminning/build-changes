import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cev extends cfe {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bva $$0, bva $$1) {
      return !$$0.ed().a(cee.U) && cfk.c($$0, $$1) && cil.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bva $$0, bva $$1) {
      List<UUID> $$2 = $$0.ed().c(cee.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cH());
   }

   @Override
   protected cee<bva> b() {
      return cee.B;
   }
}
