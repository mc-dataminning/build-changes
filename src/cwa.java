import java.util.Map;
import javax.annotation.Nullable;

public class cwa extends csc {
   protected final dfc a;
   private final iw b;

   public cwa(dfc $$0, dfc $$1, cuc.a $$2, iw $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcd $$0, dtc $$1, ir $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dtc c(cyd $$0) {
      dtc $$1 = this.a.a($$0);
      dtc $$2 = null;
      dcd $$3 = $$0.q();
      ir $$4 = $$0.a();

      for (iw $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dtc $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ewz.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfc, cuc> $$0, cuc $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
