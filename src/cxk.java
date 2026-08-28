import java.util.List;
import javax.annotation.Nullable;

public class cxk extends cvg {
   public cxk(cvg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      cyu $$4 = $$0.a(kr.L);
      if ($$4 != null) {
         if (!azz.h($$4.e())) {
            $$2.add(xd.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xd.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awn.c.b(this));
      return brk.a;
   }

   public static boolean a(cvl $$0, et $$1, @Nullable cnp $$2) {
      cyu $$3 = $$0.a(kr.L);
      if ($$3 != null && !$$3.g()) {
         cyu $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kr.L, $$4);
            return true;
         }

         $$0.b(kr.L, $$3.c());
      }

      return false;
   }
}
