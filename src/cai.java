import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class cai extends car {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bqo $$0, bqo $$1) {
      return !$$0.dP().a(bzr.U) && cax.c($$0, $$1) && cdv.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bqo $$0, bqo $$1) {
      List<UUID> $$2 = $$0.dP().c(bzr.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bzr<bqo> b() {
      return bzr.B;
   }
}
