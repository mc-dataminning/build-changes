import javax.annotation.Nullable;

public class cou extends cmt {
   public cou(cmt.a $$0) {
      super($$0);
   }

   @Override
   public bkb a(cpj $$0) {
      ctp $$1 = $$0.q();
      hx $$2 = $$0.a();
      djh $$3 = $$1.a_($$2);
      if ($$3.a(cws.oa)) {
         return dba.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bkb.a($$1.B) : bkb.d;
      } else {
         return bkb.d;
      }
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(asc.c.b(this));
      return bkc.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sn $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         st $$1 = $$0.c("pages", 8);

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
