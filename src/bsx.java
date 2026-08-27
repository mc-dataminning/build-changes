import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bsx extends btf {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bjg $$0, bjg $$1) {
      return !$$0.dN().a(bsh.T) && btl.c($$0, $$1) && bwg.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bjg $$0, bjg $$1) {
      List<UUID> $$2 = $$0.dN().c(bsh.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.cv());
   }

   @Override
   protected bsh<bjg> b() {
      return bsh.B;
   }
}
