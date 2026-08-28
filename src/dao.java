import java.util.Map;
import javax.annotation.Nullable;

public class dao extends cxl {
   protected final dmf a;
   private final ja b;

   public dao(dmf $$0, dmf $$1, ja $$2, cyz.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(djd $$0, eah $$1, iu $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected eah c(dcw $$0) {
      eah $$1 = this.a.a($$0);
      eah $$2 = null;
      djd $$3 = $$0.q();
      iu $$4 = $$0.a();

      for (ja $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            eah $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fev.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dmf, cyz> $$0, cyz $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
