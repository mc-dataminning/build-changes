import java.util.List;
import org.apache.commons.lang3.Validate;

public class cvs extends czc {
   public cvs(dkm $$0, dkm $$1, cxl.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(djd.class, $$0);
      Validate.isInstanceOf(djd.class, $$1);
   }

   public static void a(cxp $$0, List<xv> $$1) {
      duo $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            duo.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwm b() {
      return ((djd)this.d()).b();
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      a($$0, $$2);
   }
}
