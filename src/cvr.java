import java.util.List;
import org.apache.commons.lang3.Validate;

public class cvr extends czb {
   public cvr(dkl $$0, dkl $$1, cxk.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(djc.class, $$0);
      Validate.isInstanceOf(djc.class, $$1);
   }

   public static void a(cxo $$0, List<xv> $$1) {
      dun $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dun.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwl b() {
      return ((djc)this.d()).b();
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      a($$0, $$2);
   }
}
