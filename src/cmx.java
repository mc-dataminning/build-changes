import java.util.Map;
import javax.annotation.Nullable;

public class cmx extends cjh {
   protected final cvf d;
   private final ib c;

   public cmx(cvf $$0, cvf $$1, clj.a $$2, ib $$3) {
      super($$0, $$2);
      this.d = $$1;
      this.c = $$3;
   }

   protected boolean a(csi $$0, dhn $$1, hx $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dhn c(cnw $$0) {
      dhn $$1 = this.d.a($$0);
      dhn $$2 = null;
      csi $$3 = $$0.q();
      hx $$4 = $$0.a();

      for (ib $$5 : $$0.f()) {
         if ($$5 != this.c.g()) {
            dhn $$6 = $$5 == this.c ? this.e().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, eke.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cvf, clj> $$0, clj $$1) {
      super.a($$0, $$1);
      $$0.put(this.d, $$1);
   }
}
