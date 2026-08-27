import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class can extends caw {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bqt $$0, bqt $$1) {
      return !$$0.dP().a(bzw.U) && cbc.c($$0, $$1) && cec.j($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bqt $$0, bqt $$1) {
      List<UUID> $$2 = $$0.dP().c(bzw.aa).orElseGet(ArrayList::new);
      return $$2.contains($$1.cw());
   }

   @Override
   protected bzw<bqt> b() {
      return bzw.B;
   }
}
