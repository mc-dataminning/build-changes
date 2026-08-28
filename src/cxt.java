import java.util.List;
import javax.annotation.Nullable;

public class cxt extends cvt {
   public cxt(cvt.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      czd $$4 = $$0.a(kt.S);
      if ($$4 != null) {
         if (!bag.h($$4.e())) {
            $$2.add(xh.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xh.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awu.c.b(this));
      return bry.a;
   }

   public static boolean a(cvx $$0, ev $$1, @Nullable coh $$2) {
      czd $$3 = $$0.a(kt.S);
      if ($$3 != null && !$$3.g()) {
         czd $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kt.S, $$4);
            return true;
         }

         $$0.b(kt.S, $$3.c());
      }

      return false;
   }
}
