import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class chy extends cih {
   public static final float a = 10.0F;

   @Override
   protected boolean a(asb $$0, byf $$1, byf $$2) {
      return !$$1.ec().a(chh.V) && cin.c($$0, $$1, $$2) && cls.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(byf $$0, byf $$1) {
      List<UUID> $$2 = $$0.ec().c(chh.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected chh<byf> b() {
      return chh.C;
   }
}
