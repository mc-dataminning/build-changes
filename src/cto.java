import java.util.List;
import org.apache.commons.lang3.Validate;

public class cto extends cxc {
   public cto(dhj $$0, dhj $$1, cvk.a $$2) {
      super($$0, $$1, $$2, jj.a);
      Validate.isInstanceOf(dga.class, $$0);
      Validate.isInstanceOf(dga.class, $$1);
   }

   public static void a(cvp $$0, List<xd> $$1) {
      drj $$2 = $$0.a(kr.ad);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            drj.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cuj b() {
      return ((dga)this.d()).b();
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      a($$0, $$2);
   }
}
