import java.util.Map;
import javax.annotation.Nullable;

public class cyt extends cvm {
   protected final dkd a;
   private final jm b;

   public cyt(dkd $$0, dkd $$1, jm $$2, cxc.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhc $$0, dxo $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dxo c(dax $$0) {
      dxo $$1 = this.a.a($$0);
      dxo $$2 = null;
      dhc $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dxo $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fbw.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dkd, cxc> $$0, cxc $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
