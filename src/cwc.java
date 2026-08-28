import java.util.Map;
import javax.annotation.Nullable;

public class cwc extends csm {
   protected final dfw a;
   private final ji b;

   public cwc(dfw $$0, dfw $$1, cuj.a $$2, ji $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcx $$0, dta $$1, jd $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dta c(cyb $$0) {
      dta $$1 = this.a.a($$0);
      dta $$2 = null;
      dcx $$3 = $$0.q();
      jd $$4 = $$0.a();

      for (ji $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dta $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, exb.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfw, cuj> $$0, cuj $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
