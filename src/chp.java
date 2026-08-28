import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class chp extends chy {
   public static final float a = 10.0F;

   @Override
   protected boolean a(aru $$0, bxw $$1, bxw $$2) {
      return !$$1.ec().a(cgy.V) && cie.c($$0, $$1, $$2) && clj.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bxw $$0, bxw $$1) {
      List<UUID> $$2 = $$0.ec().c(cgy.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cgy<bxw> b() {
      return cgy.C;
   }
}
