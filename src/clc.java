import javax.annotation.Nullable;

public class clc extends cjc {
   public clc(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfl $$3 = $$1.a_($$2);
      if ($$3.a(csy.oa)) {
         return cxf.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bha.a($$1.B) : bha.d;
      } else {
         return bha.d;
      }
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(app.c.b(this));
      return bhb.a($$3, $$0.w_());
   }

   public static boolean a(@Nullable qy $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         re $$1 = $$0.c("pages", 8);

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
