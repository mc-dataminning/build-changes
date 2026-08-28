import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdl extends cdu {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btq $$0, btq $$1) {
      return !$$0.dS().a(ccu.U) && cea.c($$0, $$1) && cha.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btq $$0, btq $$1) {
      List<UUID> $$2 = $$0.dS().c(ccu.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected ccu<btq> b() {
      return ccu.B;
   }
}
