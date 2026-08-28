import java.util.Map;
import javax.annotation.Nullable;

public class czb extends cvu {
   protected final dkl a;
   private final jm b;

   public czb(dkl $$0, dkl $$1, jm $$2, cxk.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhk $$0, dxu $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dxu c(dbf $$0) {
      dxu $$1 = this.a.a($$0);
      dxu $$2 = null;
      dhk $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dxu $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fcc.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dkl, cxk> $$0, cxk $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
