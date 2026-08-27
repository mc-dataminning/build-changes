import java.util.List;
import javax.annotation.Nullable;

public class crg extends cng {
   public crg(cpl.a $$0) {
      super($$0);
   }

   @Override
   public cpq an_() {
      return cro.a(super.an_(), crp.E);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      cro.a($$0, $$2, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public String j(cpq $$0) {
      return crm.a(cro.d($$0), this.a() + ".effect.");
   }
}
