import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfa extends cfj {
   public static final float a = 10.0F;

   @Override
   protected boolean a(arc $$0, bvf $$1, bvf $$2) {
      return !$$1.ec().a(cej.U) && cfp.c($$0, $$1, $$2) && ciq.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvf $$0, bvf $$1) {
      List<UUID> $$2 = $$0.ec().c(cej.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cej<bvf> b() {
      return cej.B;
   }
}
