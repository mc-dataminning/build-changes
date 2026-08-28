public class ehe implements diy {
   private int a;

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(dji.E)) {
            azv $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + (60 + $$3.a(60)) * 20;
               if ($$0.z_() >= 5 || !$$0.B_().g()) {
                  for (arr $$4 : $$0.z()) {
                     if (!$$4.V_()) {
                        iv $$5 = $$4.du();
                        if (!$$0.B_().g() || $$5.v() >= $$0.P() && $$0.h($$5)) {
                           bue $$6 = $$0.d_($$5);
                           if ($$6.a($$3.i() * 3.0F)) {
                              awt $$7 = $$4.I();
                              int $$8 = azm.a($$7.a(awx.i.b(awx.n)), 1, Integer.MAX_VALUE);
                              int $$9 = 24000;
                              if ($$3.a($$8) >= 72000) {
                                 iv $$10 = $$5.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                                 eat $$11 = $$0.a_($$10);
                                 exa $$12 = $$0.b_($$10);
                                 if (djx.a($$0, $$10, $$11, $$12, bwr.aP)) {
                                    byb $$13 = null;
                                    int $$14 = 1 + $$3.a($$6.a().a() + 1);

                                    for (int $$15 = 0; $$15 < $$14; $$15++) {
                                       coq $$16 = bwr.aP.a($$0, bwq.a);
                                       if ($$16 != null) {
                                          $$16.a($$10, 0.0F, 0.0F);
                                          $$13 = $$16.a($$0, $$6, bwq.a, $$13);
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
