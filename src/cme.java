import javax.annotation.Nullable;

public class cme extends cke {
   public cme(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgb $$3 = $$1.a_($$2);
      if ($$3.a(cuc.oa)) {
         return cyj.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bib.a($$1.B) : bib.d;
      } else {
         return bib.d;
      }
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aqn.c.b(this));
      return bic.a($$3, $$0.x_());
   }

   public static boolean a(@Nullable rt $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         rz $$1 = $$0.c("pages", 8);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            String $$3 = $$1.j($$2);
            if ($$3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}
