import java.util.List;
import javax.annotation.Nullable;

public class czk extends cxk {
   public czk(cxk.a $$0) {
      super($$0);
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      daw $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bbb.h($$4.e())) {
            $$2.add(xv.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xv.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(axp.c.b(this));
      return bti.a;
   }

   public static boolean a(cxo $$0, ew $$1, @Nullable cpw $$2) {
      daw $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         daw $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
