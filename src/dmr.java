public class dmr implements crf {
   private int a;

   @Override
   public int a(ama $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cro.C)) {
         return 0;
      } else {
         ato $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (amb $$5 : $$0.v()) {
                  if (!$$5.N_()) {
                     ht $$6 = $$5.dl();
                     if (!$$0.D_().g() || $$6.v() >= $$0.z_() && $$0.g($$6)) {
                        bio $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           aqt $$8 = $$5.F();
                           int $$9 = ati.a($$8.a(aqx.i.b(aqx.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              ht $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dgw $$12 = $$0.a_($$11);
                              ecg $$13 = $$0.b_($$11);
                              if (csd.a($$0, $$11, $$12, $$13, bkm.au)) {
                                 blr $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cbc $$17 = bkm.au.a((crs)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, blc.a, $$14, null);
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
