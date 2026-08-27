import java.util.List;
import org.apache.commons.lang3.Validate;

public class crl extends cvb {
   public crl(dea $$0, dea $$1, ctl.a $$2) {
      super($$0, $$1, $$2, it.a);
      Validate.isInstanceOf(dcr.class, $$0);
      Validate.isInstanceOf(dcr.class, $$1);
   }

   public static void a(ctq $$0, List<wx> $$1) {
      dnz $$2 = $$0.a(kb.W);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dnz.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public csj b() {
      return ((dcr)this.d()).b();
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      a($$0, $$2);
   }
}
