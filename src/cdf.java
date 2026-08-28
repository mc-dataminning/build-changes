import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdf extends cdo {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btk $$0, btk $$1) {
      return !$$0.dS().a(cco.U) && cdu.c($$0, $$1) && cgu.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btk $$0, btk $$1) {
      List<UUID> $$2 = $$0.dS().c(cco.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected cco<btk> b() {
      return cco.B;
   }
}
