import java.util.List;
import javax.annotation.Nullable;

public class czc extends cxc {
   public czc(cxc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      dao $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bar.h($$4.e())) {
            $$2.add(xk.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xk.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(axf.c.b(this));
      return bta.a;
   }

   public static boolean a(cxg $$0, ew $$1, @Nullable cpo $$2) {
      dao $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         dao $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
