import java.util.Map;
import javax.annotation.Nullable;

public class cxc extends ctr {
   protected final dhj a;
   private final jj b;

   public cxc(dhj $$0, dhj $$1, cvk.a $$2, jj $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dej $$0, duo $$1, je $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected duo c(czk $$0) {
      duo $$1 = this.a.a($$0);
      duo $$2 = null;
      dej $$3 = $$0.q();
      je $$4 = $$0.a();

      for (jj $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            duo $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eyx.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dhj, cvk> $$0, cvk $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
