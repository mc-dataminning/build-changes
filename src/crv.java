import java.util.List;
import org.apache.commons.lang3.Validate;

public class crv extends cvl {
   public crv(dff $$0, dff $$1, ctv.a $$2) {
      super($$0, $$1, $$2, jf.a);
      Validate.isInstanceOf(ddw.class, $$0);
      Validate.isInstanceOf(ddw.class, $$1);
   }

   public static void a(cua $$0, List<wu> $$1) {
      dpe $$2 = $$0.a(kn.X);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dpe.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cst b() {
      return ((ddw)this.d()).b();
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      a($$0, $$2);
   }
}
