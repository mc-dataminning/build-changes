import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ceq extends cez {
   public static final float a = 10.0F;

   @Override
   protected boolean a(buv $$0, buv $$1) {
      return !$$0.ed().a(cdz.U) && cff.c($$0, $$1) && cig.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(buv $$0, buv $$1) {
      List<UUID> $$2 = $$0.ed().c(cdz.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cH());
   }

   @Override
   protected cdz<buv> b() {
      return cdz.B;
   }
}
