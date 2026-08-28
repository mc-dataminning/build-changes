import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class chc extends chl {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arq $$0, bxj $$1, bxj $$2) {
      return !$$1.eb().a(cgl.V) && chr.c($$0, $$1, $$2) && ckz.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bxj $$0, bxj $$1) {
      List<UUID> $$2 = $$0.eb().c(cgl.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cF());
   }

   @Override
   protected cgl<bxj> b() {
      return cgl.C;
   }
}
