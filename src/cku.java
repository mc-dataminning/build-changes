import java.util.Map;
import javax.annotation.Nullable;

public class cku extends che {
   protected final ctc d;
   private final ha c;

   public cku(ctc $$0, ctc $$1, cjg.a $$2, ha $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(cqe $$0, dfd $$1, gw $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dfd c(clt $$0) {
      dfd $$1 = this.d.a($$0);
      dfd $$2 = null;
      cqe $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dfd $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ehm.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<ctc, cjg> $$0, cjg $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
