public class dzh implements dch {
   private int a;

   @Override
   public int a(aqt $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ab().b(dcq.C)) {
         return 0;
      } else {
         ayv $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (aqu $$5 : $$0.x()) {
                  if (!$$5.N_()) {
                     jd $$6 = $$5.dq();
                     if (!$$0.D_().g() || $$6.v() >= $$0.z_() && $$0.h($$6)) {
                        bqo $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           avu $$8 = $$5.I();
                           int $$9 = ayn.a($$8.a(avy.i.b(avy.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jd $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dta $$12 = $$0.a_($$11);
                              eoy $$13 = $$0.b_($$11);
                              if (ddf.a($$0, $$11, $$12, $$13, bsw.ay)) {
                                 buf $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    ckd $$17 = bsw.ay.a((dcu)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, btp.a, $$14);
                                       $$0.a_($$17);
                                       $$4++;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               return $$4;
            }
         }
      }
   }
}
