import java.util.List;
import org.apache.commons.lang3.Validate;

public class cvn extends cyx {
   public cvn(dke $$0, dke $$1, cxg.a $$2) {
      super($$0, $$1, jm.a, $$2);
      Validate.isInstanceOf(div.class, $$0);
      Validate.isInstanceOf(div.class, $$1);
   }

   public static void a(cxk $$0, List<xv> $$1) {
      dug $$2 = $$0.a(ku.ai);
      if ($$2 != null) {
         for (int $$3 = 0; $$3 < Math.min($$2.b().size(), 6); $$3++) {
            dug.b $$4 = $$2.b().get($$3);
            $$1.add($$4.a().a(n.h));
         }
      }
   }

   public cwh b() {
      return ((div)this.d()).b();
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      a($$0, $$2);
   }
}
