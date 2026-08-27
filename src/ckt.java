import javax.annotation.Nullable;

public class ckt extends cit {
   public ckt(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(cli $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      dfa $$3 = $$1.a_($$2);
      if ($$3.a(csn.oa)) {
         return cwu.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgq.a($$1.B) : bgq.d;
      } else {
         return bgq.d;
      }
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
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
