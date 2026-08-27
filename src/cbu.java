import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cbu extends ccd {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bsa $$0, bsa $$1) {
      return !$$0.dQ().a(cbd.U) && ccj.c($$0, $$1) && cfj.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bsa $$0, bsa $$1) {
      List<UUID> $$2 = $$0.dQ().c(cbd.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cx());
   }

   @Override
   protected cbd<bsa> b() {
      return cbd.B;
   }
}
