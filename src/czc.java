import java.util.Map;
import javax.annotation.Nullable;

public class czc extends cvv {
   protected final dkm a;
   private final jm b;

   public czc(dkm $$0, dkm $$1, jm $$2, cxl.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhl $$0, dxv $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dxv c(dbg $$0) {
      dxv $$1 = this.a.a($$0);
      dxv $$2 = null;
      dhl $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dxv $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fcd.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dkm, cxl> $$0, cxl $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
