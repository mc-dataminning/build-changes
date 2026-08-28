import java.util.Map;
import javax.annotation.Nullable;

public class cxz extends cus {
   protected final diq a;
   private final jm b;

   public cxz(diq $$0, diq $$1, jm $$2, cwi.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dfp $$0, dvv $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dvv c(dad $$0) {
      dvv $$1 = this.a.a($$0);
      dvv $$2 = null;
      dfp $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dvv $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fad.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<diq, cwi> $$0, cwi $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
