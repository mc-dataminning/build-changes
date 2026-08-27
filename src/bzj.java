import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bzj extends bzs {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bpp $$0, bpp $$1) {
      return !$$0.dP().a(bys.U) && bzy.c($$0, $$1) && ccw.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bpp $$0, bpp $$1) {
      List<UUID> $$2 = $$0.dP().c(bys.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bys<bpp> b() {
      return bys.B;
   }
}
