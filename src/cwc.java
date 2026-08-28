import java.util.Map;
import javax.annotation.Nullable;

public class cwc extends csp {
   protected final dfb a;
   private final je b;

   public cwc(dfb $$0, dfb $$1, cum.a $$2, je $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcd $$0, dse $$1, iz $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dse c(cyc $$0) {
      dse $$1 = this.a.a($$0);
      dse $$2 = null;
      dcd $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dse $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, evy.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfb, cum> $$0, cum $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
