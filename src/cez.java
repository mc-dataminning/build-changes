import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cez extends cfi {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bve $$0, bve $$1) {
      return !$$0.ee().a(cei.U) && cfo.c($$0, $$1) && cip.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bve $$0, bve $$1) {
      List<UUID> $$2 = $$0.ee().c(cei.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cI());
   }

   @Override
   protected cei<bve> b() {
      return cei.B;
   }
}
