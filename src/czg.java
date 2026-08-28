import java.util.List;
import javax.annotation.Nullable;

public class czg extends cxg {
   public czg(cxg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      das $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bbb.h($$4.e())) {
            $$2.add(xv.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xv.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(axp.c.b(this));
      return bte.a;
   }

   public static boolean a(cxk $$0, ew $$1, @Nullable cps $$2) {
      das $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         das $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
