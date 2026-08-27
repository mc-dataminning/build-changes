import java.util.Map;
import javax.annotation.Nullable;

public class csr extends cph {
   protected final dby a;
   private final ih b;

   public csr(dby $$0, dby $$1, cre.a $$2, ih $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(cza $$0, doz $$1, ib $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected doz c(cuo $$0) {
      doz $$1 = this.a.a($$0);
      doz $$2 = null;
      cza $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            doz $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, esf.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dby, cre> $$0, cre $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
