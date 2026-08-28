public class eex implements dhc {
   private int a;

   @Override
   public int a(arn $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.O().c(dhl.D)) {
         return 0;
      } else {
         azs $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.z_() < 5 && $$0.B_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (aro $$5 : $$0.z()) {
                  if (!$$5.U_()) {
                     jj $$6 = $$5.dv();
                     if (!$$0.B_().g() || $$6.v() >= $$0.P() && $$0.h($$6)) {
                        bto $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awq $$8 = $$5.I();
                           int $$9 = azk.a($$8.a(awu.i.b(awu.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jj $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dym $$12 = $$0.a_($$11);
                              eut $$13 = $$0.b_($$11);
                              if (dia.a($$0, $$11, $$12, $$13, bwb.aP)) {
                                 bxj $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cnl $$17 = bwb.aP.a($$0, bwa.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bwa.a, $$14);
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
