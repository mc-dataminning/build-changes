import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdz extends cei {
   public static final float a = 10.0F;

   @Override
   protected boolean a(buf $$0, buf $$1) {
      return !$$0.dX().a(cdi.U) && ceo.c($$0, $$1) && chp.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(buf $$0, buf $$1) {
      List<UUID> $$2 = $$0.dX().c(cdi.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cD());
   }

   @Override
   protected cdi<buf> b() {
      return cdi.B;
   }
}
