public class edv implements dgl {
   private int a;

   @Override
   public int a(arx $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.O().b(dgv.D)) {
         return 0;
      } else {
         bac $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.E_() < 5 && $$0.G_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (ary $$5 : $$0.z()) {
                  if (!$$5.aa_()) {
                     jh $$6 = $$5.dw();
                     if (!$$0.G_().g() || $$6.v() >= $$0.P() && $$0.h($$6)) {
                        bsy $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           axb $$8 = $$5.I();
                           int $$9 = azu.a($$8.a(axf.i.b(axf.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jh $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dxo $$12 = $$0.a_($$11);
                              etq $$13 = $$0.b_($$11);
                              if (dhk.a($$0, $$11, $$12, $$13, bvi.aQ)) {
                                 bwq $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cmq $$17 = bvi.aQ.a($$0, bvh.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bvh.a, $$14);
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
