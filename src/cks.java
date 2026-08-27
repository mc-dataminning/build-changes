import javax.annotation.Nullable;

public class cks extends cis {
   public cks(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      gu $$2 = $$0.a();
      dez $$3 = $$1.a_($$2);
      if ($$3.a(csm.oa)) {
         return cwt.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgq.a($$1.B) : bgq.d;
      } else {
         return bgq.d;
      }
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apg.c.b(this));
      return bgr.a($$3, $$0.r_());
   }

   public static boolean a(@Nullable qr $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         qx $$1 = $$0.c("pages", 8);

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
