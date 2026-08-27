import java.util.Map;
import javax.annotation.Nullable;

public class coa extends ckk {
   protected final cwj d;
   private final ic c;

   public coa(cwj $$0, cwj $$1, cmm.a $$2, ic $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(ctl $$0, dja $$1, hx $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dja c(cpa $$0) {
      dja $$1 = this.d.a($$0);
      dja $$2 = null;
      ctl $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dja $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, elr.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cwj, cmm> $$0, cmm $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
