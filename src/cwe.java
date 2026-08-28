import java.util.Map;
import javax.annotation.Nullable;

public class cwe extends cso {
   protected final dfy a;
   private final ji b;

   public cwe(dfy $$0, dfy $$1, cul.a $$2, ji $$3) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
   }

   protected boolean a(dcz $$0, dtc $$1, jd $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected dtc c(cyd $$0) {
      dtc $$1 = this.a.a($$0);
      dtc $$2 = null;
      dcz $$3 = $$0.q();
      jd $$4 = $$0.a();

      for (ji $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            dtc $$6 = $$5 == this.b ? this.d().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, exf.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dfy, cul> $$0, cul $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
