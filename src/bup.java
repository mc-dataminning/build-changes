import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bup extends bux {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bky $$0, bky $$1) {
      return !$$0.dN().a(btz.T) && bvd.c($$0, $$1) && bxy.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bky $$0, bky $$1) {
      List<UUID> $$2 = $$0.dN().c(btz.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected btz<bky> b() {
      return btz.B;
   }
}
