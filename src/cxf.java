import java.util.Map;
import javax.annotation.Nullable;

public class cxf extends ctu {
   protected final dhm a;
   private final jk b;

   public cxf(dhm $$0, dhm $$1, cvn.a $$2, jk $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dem $$0, dus $$1, jf $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dus c(czn $$0) {
      dus $$1 = this.a.a($$0);
      dus $$2 = null;
      dem $$3 = $$0.q();
      jf $$4 = $$0.a();

      for (jk $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dus $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ezb.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dhm, cvn> $$0, cvn $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
