import java.util.List;
import javax.annotation.Nullable;

public class czl extends cxl {
   public czl(cxl.a $$0) {
      super($$0);
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      dax $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bbb.h($$4.e())) {
            $$2.add(xv.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xv.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(axp.c.b(this));
      return btj.a;
   }

   public static boolean a(cxp $$0, ew $$1, @Nullable cpx $$2) {
      dax $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         dax $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
