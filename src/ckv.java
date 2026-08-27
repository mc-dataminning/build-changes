import javax.annotation.Nullable;

public class ckv extends civ {
   public ckv(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      gw $$2 = $$0.a();
      dfe $$3 = $$1.a_($$2);
      if ($$3.a(csr.oa)) {
         return cwy.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bgt.a($$1.B) : bgt.d;
      } else {
         return bgt.d;
      }
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(apj.c.b(this));
      return bgu.a($$3, $$0.r_());
   }

   public static boolean a(@Nullable qu $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         ra $$1 = $$0.c("pages", 8);

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
