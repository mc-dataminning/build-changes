public class cmj extends clt {
   public cmj(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (csm.a($$5.d()) instanceof czl) {
               $$2++;
            } else {
               if (!($$5.d() instanceof chn)) {
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

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = ciy.b;
      chn $$3 = (chn)cjb.qu;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cit $$6 = $$5.d();
            if (csm.a($$6) instanceof czl) {
               $$2 = $$5;
            } else if ($$6 instanceof chn) {
               $$3 = (chn)$$6;
            }
         }
      }

      ciy $$7 = czl.b($$3.d());
      if ($$2.u()) {
         $$7.c($$2.v().h());
      }

      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmd<?> aj_() {
      return cmd.m;
   }
}
