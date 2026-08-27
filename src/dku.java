public class dku implements coy {
   private int a;

   @Override
   public int a(akk $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cph.A)) {
         return 0;
      } else {
         aru $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.v_() < 5 && $$0.x_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (akl $$5 : $$0.v()) {
                  if (!$$5.G_()) {
                     gu $$6 = $$5.dk();
                     if (!$$0.x_().g() || $$6.v() >= $$0.t_() && $$0.g($$6)) {
                        bgo $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           apc $$8 = $$5.E();
                           int $$9 = arp.a($$8.a(apg.i.b(apg.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              gu $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dez $$12 = $$0.a_($$11);
                              eac $$13 = $$0.b_($$11);
                              if (cpw.a($$0, $$11, $$12, $$13, bim.au)) {
                                 bjr $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    bzc $$17 = bim.au.a((cpl)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bjc.a, $$14, null);
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
