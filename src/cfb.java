import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfb extends cfk {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arc $$0, bvg $$1, bvg $$2) {
      return !$$1.ec().a(cek.U) && cfq.c($$0, $$1, $$2) && cir.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvg $$0, bvg $$1) {
      List<UUID> $$2 = $$0.ec().c(cek.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cek<bvg> b() {
      return cek.B;
   }
}
