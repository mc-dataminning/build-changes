import java.util.List;
import javax.annotation.Nullable;

public class cyi extends cwi {
   public cyi(cwi.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      czu $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!baj.h($$4.e())) {
            $$2.add(xj.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xj.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awx.c.b(this));
      return bsk.a;
   }

   public static boolean a(cwm $$0, ew $$1, @Nullable cou $$2) {
      czu $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         czu $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
