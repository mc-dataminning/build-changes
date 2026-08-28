import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cee extends cen {
   public static final float a = 10.0F;

   @Override
   protected boolean a(buk $$0, buk $$1) {
      return !$$0.dX().a(cdn.U) && cet.c($$0, $$1) && chu.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(buk $$0, buk $$1) {
      List<UUID> $$2 = $$0.dX().c(cdn.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cD());
   }

   @Override
   protected cdn<buk> b() {
      return cdn.B;
   }
}
