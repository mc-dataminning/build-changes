import java.util.Map;
import javax.annotation.Nullable;

public class cyt extends cvo {
   protected final dke a;
   private final jn b;

   public cyt(dke $$0, dke $$1, jn $$2, cxd.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhc $$0, dxq $$1, ji $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dxq c(dax $$0) {
      dxq $$1 = this.a.a($$0);
      dxq $$2 = null;
      dhc $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dxq $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fcc.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dke, cxd> $$0, cxd $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
