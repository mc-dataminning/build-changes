import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cgk extends cgt {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arn $$0, bwr $$1, bwr $$2) {
      return !$$1.eb().a(cft.V) && cgz.c($$0, $$1, $$2) && ckd.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bwr $$0, bwr $$1) {
      List<UUID> $$2 = $$0.eb().c(cft.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cft<bwr> b() {
      return cft.C;
   }
}
