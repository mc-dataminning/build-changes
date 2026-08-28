public class cze extends cyl {
   public cze(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dex.a($$5.g()) instanceof dlw) {
               $$2++;
            } else {
               if (!($$5.g() instanceof cth)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cun a(cqi $$0, jk.a $$1) {
      cun $$2 = cun.l;
      cth $$3 = (cth)cuq.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cui $$6 = $$5.g();
            if (dex.a($$6) instanceof dlw) {
               $$2 = $$5;
            } else if ($$6 instanceof cth) {
               $$3 = (cth)$$6;
            }
         }
      }

      dex $$7 = dlw.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.m;
   }
}
