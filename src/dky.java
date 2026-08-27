public class dky implements cpo {
   private int a;

   @Override
   public int a(akt $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cpx.A)) {
         return 0;
      } else {
         ash $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.A_() < 5 && $$0.C_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (aku $$5 : $$0.v()) {
                  if (!$$5.M_()) {
                     gw $$6 = $$5.dl();
                     if (!$$0.C_().g() || $$6.v() >= $$0.y_() && $$0.g($$6)) {
                        bhc $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           apm $$8 = $$5.F();
                           int $$9 = asb.a($$8.a(apq.i.b(apq.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              gw $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dfd $$12 = $$0.a_($$11);
                              eag $$13 = $$0.b_($$11);
                              if (cqm.a($$0, $$11, $$12, $$13, bja.au)) {
                                 bkf $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    bzq $$17 = bja.au.a((cqb)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bjq.a, $$14, null);
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
