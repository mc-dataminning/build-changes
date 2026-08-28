import java.util.List;
import javax.annotation.Nullable;

public class cxo extends cvn {
   public cxo(cvn.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      cze $$4 = $$0.a(ks.O);
      if ($$4 != null) {
         if (!bac.h($$4.e())) {
            $$2.add(xe.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xe.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awq.c.b(this));
      return brs.a;
   }

   public static boolean a(cvs $$0, eu $$1, @Nullable cnx $$2) {
      cze $$3 = $$0.a(ks.O);
      if ($$3 != null && !$$3.g()) {
         cze $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ks.O, $$4);
            return true;
         }

         $$0.b(ks.O, $$3.c());
      }

      return false;
   }
}
