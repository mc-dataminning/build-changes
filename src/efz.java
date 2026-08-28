public class efz implements dic {
   private int a;

   @Override
   public void a(aro $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(dil.D)) {
            azt $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + (60 + $$3.a(60)) * 20;
               if ($$0.z_() >= 5 || !$$0.B_().g()) {
                  for (arp $$4 : $$0.z()) {
                     if (!$$4.U_()) {
                        iu $$5 = $$4.dv();
                        if (!$$0.B_().g() || $$5.v() >= $$0.P() && $$0.h($$5)) {
                           btw $$6 = $$0.d_($$5);
                           if ($$6.a($$3.i() * 3.0F)) {
                              awr $$7 = $$4.I();
                              int $$8 = azk.a($$7.a(awv.i.b(awv.n)), 1, Integer.MAX_VALUE);
                              int $$9 = 24000;
                              if ($$3.a($$8) >= 72000) {
                                 iu $$10 = $$5.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                                 dzo $$11 = $$0.a_($$10);
                                 evv $$12 = $$0.b_($$10);
                                 if (dja.a($$0, $$10, $$11, $$12, bwj.aP)) {
                                    bxr $$13 = null;
                                    int $$14 = 1 + $$3.a($$6.a().a() + 1);

                                    for (int $$15 = 0; $$15 < $$14; $$15++) {
                                       cnv $$16 = bwj.aP.a($$0, bwi.a);
                                       if ($$16 != null) {
                                          $$16.a($$10, 0.0F, 0.0F);
                                          $$13 = $$16.a($$0, $$6, bwi.a, $$13);
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
