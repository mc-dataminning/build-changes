import java.util.Map;
import javax.annotation.Nullable;

public class cxs extends cul {
   protected final dij a;
   private final jm b;

   public cxs(dij $$0, dij $$1, jm $$2, cwb.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dfi $$0, dvo $$1, jh $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dvo c(czw $$0) {
      dvo $$1 = this.a.a($$0);
      dvo $$2 = null;
      dfi $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dvo $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, ezw.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dij, cwb> $$0, cwb $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
