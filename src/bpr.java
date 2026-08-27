import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class bpr extends bpz {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bfz $$0, bfz $$1) {
      return !$$0.dK().a(bpb.T) && bqf.c($$0, $$1) && bta.l($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bfz $$0, bfz $$1) {
      List<UUID> $$2 = $$0.dK().c(bpb.Z).orElseGet(ArrayList::new);
      return $$2.contains($$1.ct());
   }

   @Override
   protected bpb<bfz> b() {
      return bpb.B;
   }
}
