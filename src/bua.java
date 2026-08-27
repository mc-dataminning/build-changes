import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bua extends bui {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bkj $$0, bkj $$1) {
      return !$$0.dN().a(btk.T) && buo.c($$0, $$1) && bxj.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bkj $$0, bkj $$1) {
      List<UUID> $$2 = $$0.dN().c(btk.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected btk<bkj> b() {
      return btk.B;
   }
}
