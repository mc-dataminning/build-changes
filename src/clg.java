import javax.annotation.Nullable;

public class clg extends cjg {
   public clg(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfd $$3 = $$1.a_($$2);
      if ($$3.a(cte.oa)) {
         return cxl.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bhe.a($$1.B) : bhe.d;
      } else {
         return bhe.d;
      }
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apq.c.b(this));
      return bhf.a($$3, $$0.w_());
   }

   public static boolean a(@Nullable qw $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         rc $$1 = $$0.c("pages", 8);

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
