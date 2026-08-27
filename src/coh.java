import java.util.Map;
import javax.annotation.Nullable;

public class coh extends ckr {
   protected final cwq d;
   private final ic c;

   public coh(cwq $$0, cwq $$1, cmt.a $$2, ic $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cts $$0, djh $$1, hx $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected djh c(cph $$0) {
      djh $$1 = this.d.a($$0);
      djh $$2 = null;
      cts $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ic $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            djh $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ely.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cwq, cmt> $$0, cmt $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
