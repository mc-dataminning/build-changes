import javax.annotation.Nullable;

public class cmw extends ckw {
   public cmw(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      ht $$2 = $$0.a();
      dgw $$3 = $$1.a_($$2);
      if ($$3.a(cuv.oa)) {
         return czd.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? biq.a($$1.B) : biq.d;
      } else {
         return biq.d;
      }
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aqx.c.b(this));
      return bir.a($$3, $$0.x_());
   }

   public static boolean a(@Nullable rz $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         sf $$1 = $$0.c("pages", 8);

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
