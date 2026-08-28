import java.util.List;
import org.apache.commons.lang3.Validate;

public class ctz extends cxk {
   public ctz(dhy $$0, dhy $$1, cvt.a $$2) {
      super($$0, $$1, jl.a, $$2);
      Validate.isInstanceOf(dgp.class, $$0);
      Validate.isInstanceOf(dgp.class, $$1);
   }

   public static void a(cvx $$0, List<xh> $$1) {
      drx $$2 = $$0.a(kt.ah);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            drx.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cuu b() {
      return ((dgp)this.d()).b();
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      a($$0, $$2);
   }
}
