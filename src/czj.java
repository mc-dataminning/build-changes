import java.util.Map;
import javax.annotation.Nullable;

public class czj extends cwf {
   protected final dku a;
   private final jo b;

   public czj(dku $$0, dku $$1, jo $$2, cxu.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dhs $$0, dym $$1, jj $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dym c(dbn $$0) {
      dym $$1 = this.a.a($$0);
      dym $$2 = null;
      dhs $$3 = $$0.q();
      jj $$4 = $$0.a();

      for (jo $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dym $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fcz.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dku, cxu> $$0, cxu $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
