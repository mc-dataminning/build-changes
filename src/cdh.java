import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdh extends cdq {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btl $$0, btl $$1) {
      return !$$0.dU().a(ccq.U) && cdw.c($$0, $$1) && cgw.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btl $$0, btl $$1) {
      List<UUID> $$2 = $$0.dU().c(ccq.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cA());
   }

   @Override
   protected ccq<btl> b() {
      return ccq.B;
   }
}
