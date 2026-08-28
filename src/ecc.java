public class ecc implements dey {
   private int a;

   @Override
   public int a(arp $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.N().b(dfi.C)) {
         return 0;
      } else {
         azu $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.D_() < 5 && $$0.F_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (arq $$5 : $$0.y()) {
                  if (!$$5.Y_()) {
                     jh $$6 = $$5.dv();
                     if (!$$0.F_().g() || $$6.v() >= $$0.O() && $$0.h($$6)) {
                        bsi $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awt $$8 = $$5.I();
                           int $$9 = azm.a($$8.a(awx.i.b(awx.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jh $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dvv $$12 = $$0.a_($$11);
                              erv $$13 = $$0.b_($$11);
                              if (dfx.a($$0, $$11, $$12, $$13, bus.aM)) {
                                 bwa $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cma $$17 = bus.aM.a($$0, bur.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bur.a, $$14);
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
