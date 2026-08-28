import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ceh extends ceq {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bun $$0, bun $$1) {
      return !$$0.dY().a(cdq.U) && cew.c($$0, $$1) && chx.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bun $$0, bun $$1) {
      List<UUID> $$2 = $$0.dY().c(cdq.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cD());
   }

   @Override
   protected cdq<bun> b() {
      return cdq.B;
   }
}
