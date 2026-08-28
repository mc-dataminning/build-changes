public class eib implements djv {
   private int a;

   @Override
   public void a(asb $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(dkf.E)) {
            bai $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + (60 + $$3.a(60)) * 20;
               if ($$0.D_() >= 5 || !$$0.F_().g()) {
                  for (asc $$4 : $$0.z()) {
                     if (!$$4.ak()) {
                        iw $$5 = $$4.dv();
                        if (!$$0.F_().g() || $$5.v() >= $$0.P() && $$0.h($$5)) {
                           bva $$6 = $$0.d_($$5);
                           if ($$6.a($$3.i() * 3.0F)) {
                              axe $$7 = $$4.H();
                              int $$8 = azz.a($$7.a(axi.i.b(axi.n)), 1, Integer.MAX_VALUE);
                              int $$9 = 24000;
                              if ($$3.a($$8) >= 72000) {
                                 iw $$10 = $$5.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                                 ebq $$11 = $$0.a_($$10);
                                 eya $$12 = $$0.b_($$10);
                                 if (dku.a($$0, $$10, $$11, $$12, bxn.aQ)) {
                                    byx $$13 = null;
                                    int $$14 = 1 + $$3.a($$6.a().a() + 1);

                                    for (int $$15 = 0; $$15 < $$14; $$15++) {
                                       cpm $$16 = bxn.aQ.a($$0, bxm.a);
                                       if ($$16 != null) {
                                          $$16.a($$10, 0.0F, 0.0F);
                                          $$13 = $$16.a($$0, $$6, bxm.a, $$13);
                                          $$0.a_($$16);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
