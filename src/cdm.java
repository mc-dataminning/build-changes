import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cdm extends cdv {
   public static final float a = 10.0F;

   @Override
   protected boolean a(btr $$0, btr $$1) {
      return !$$0.dS().a(ccv.U) && ceb.c($$0, $$1) && chb.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(btr $$0, btr $$1) {
      List<UUID> $$2 = $$0.dS().c(ccv.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cz());
   }

   @Override
   protected ccv<btr> b() {
      return ccv.B;
   }
}
