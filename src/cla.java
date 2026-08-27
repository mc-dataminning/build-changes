import javax.annotation.Nullable;

public class cla extends cja {
   public cla(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfj $$3 = $$1.a_($$2);
      if ($$3.a(csw.oa)) {
         return cxd.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgy.a($$1.B) : bgy.d;
      } else {
         return bgy.d;
      }
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apo.c.b(this));
      return bgz.a($$3, $$0.w_());
   }

   public static boolean a(@Nullable qx $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         rd $$1 = $$0.c("pages", 8);

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
