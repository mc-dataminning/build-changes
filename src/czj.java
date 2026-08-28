public class czj extends cyp {
   public czj(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfw.a($$5.g()) instanceof dmw) {
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

   public cuo a(cyn $$0, jo.a $$1) {
      cuo $$2 = cuo.l;
      cth $$3 = (cth)cur.ri;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cuj $$6 = $$5.g();
            if (dfw.a($$6) instanceof dmw) {
               $$2 = $$5;
            } else if ($$6 instanceof cth) {
               $$3 = (cth)$$6;
            }
         }
      }

      dfw $$7 = dmw.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czc<?> ap_() {
      return czc.m;
   }
}
