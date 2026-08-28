import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cfd extends cfm {
   public static final float a = 10.0F;

   @Override
   protected boolean a(ard $$0, bvi $$1, bvi $$2) {
      return !$$1.eb().a(cem.U) && cfs.c($$0, $$1, $$2) && cit.j($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(bvi $$0, bvi $$1) {
      List<UUID> $$2 = $$0.eb().c(cem.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cG());
   }

   @Override
   protected cem<bvi> b() {
      return cem.B;
   }
}
