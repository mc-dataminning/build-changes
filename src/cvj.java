import java.util.List;
import org.apache.commons.lang3.Validate;

public class cvj extends cyt {
   public cvj(dkd $$0, dkd $$1, cxc.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(diu.class, $$0);
      Validate.isInstanceOf(diu.class, $$1);
   }

   public static void a(cxg $$0, List<xk> $$1) {
      duh $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            duh.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwd b() {
      return ((diu)this.d()).b();
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      a($$0, $$2);
   }
}
