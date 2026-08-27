public class dlw implements cqm {
   private int a;

   @Override
   public int a(alq $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cqv.B)) {
         return 0;
      } else {
         ate $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (alr $$5 : $$0.v()) {
                  if (!$$5.N_()) {
                     ht $$6 = $$5.dl();
                     if (!$$0.D_().g() || $$6.v() >= $$0.z_() && $$0.g($$6)) {
                        bhz $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           aqj $$8 = $$5.F();
                           int $$9 = asy.a($$8.a(aqn.i.b(aqn.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              ht $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dgb $$12 = $$0.a_($$11);
                              ebe $$13 = $$0.b_($$11);
                              if (crk.a($$0, $$11, $$12, $$13, bjx.au)) {
                                 blc $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    can $$17 = bjx.au.a((cqz)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bkn.a, $$14, null);
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
