import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cgv extends che {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arq $$0, bxc $$1, bxc $$2) {
      return !$$1.eb().a(cge.V) && chk.c($$0, $$1, $$2) && ckr.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bxc $$0, bxc $$1) {
      List<UUID> $$2 = $$0.eb().c(cge.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cge<bxc> b() {
      return cge.C;
   }
}
