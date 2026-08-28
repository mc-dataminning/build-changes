import java.util.List;
import javax.annotation.Nullable;

public class cxl extends cvk {
   public cxl(cvk.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      czb $$4 = $$0.a(kr.O);
      if ($$4 != null) {
         if (!baa.h($$4.e())) {
            $$2.add(xd.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xd.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awo.c.b(this));
      return brp.a;
   }

   public static boolean a(cvp $$0, et $$1, @Nullable cnu $$2) {
      czb $$3 = $$0.a(kr.O);
      if ($$3 != null && !$$3.g()) {
         czb $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kr.O, $$4);
            return true;
         }

         $$0.b(kr.O, $$3.c());
      }

      return false;
   }
}
