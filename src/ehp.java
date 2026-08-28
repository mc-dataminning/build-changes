public class ehp implements djj {
   private int a;

   @Override
   public void a(ars $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(djt.E)) {
            azx $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + (60 + $$3.a(60)) * 20;
               if ($$0.D_() >= 5 || !$$0.F_().g()) {
                  for (art $$4 : $$0.z()) {
                     if (!$$4.Z_()) {
                        iv $$5 = $$4.dv();
                        if (!$$0.F_().g() || $$5.v() >= $$0.P() && $$0.h($$5)) {
                           bup $$6 = $$0.d_($$5);
                           if ($$6.a($$3.i() * 3.0F)) {
                              awv $$7 = $$4.I();
                              int $$8 = azo.a($$7.a(awz.i.b(awz.n)), 1, Integer.MAX_VALUE);
                              int $$9 = 24000;
                              if ($$3.a($$8) >= 72000) {
                                 iv $$10 = $$5.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                                 ebe $$11 = $$0.a_($$10);
                                 exo $$12 = $$0.b_($$10);
                                 if (dki.a($$0, $$10, $$11, $$12, bxc.aQ)) {
                                    bym $$13 = null;
                                    int $$14 = 1 + $$3.a($$6.a().a() + 1);

                                    for (int $$15 = 0; $$15 < $$14; $$15++) {
                                       cpb $$16 = bxc.aQ.a($$0, bxb.a);
                                       if ($$16 != null) {
                                          $$16.a($$10, 0.0F, 0.0F);
                                          $$13 = $$16.a($$0, $$6, bxb.a, $$13);
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
