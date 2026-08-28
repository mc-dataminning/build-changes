public class eba implements ddv {
   private int a;

   @Override
   public int a(arj $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ac().b(def.C)) {
         return 0;
      } else {
         azn $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.A_() < 5 && $$0.C_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (ark $$5 : $$0.x()) {
                  if (!$$5.Q_()) {
                     jf $$6 = $$5.ds();
                     if (!$$0.C_().g() || $$6.v() >= $$0.N() && $$0.h($$6)) {
                        brq $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awm $$8 = $$5.J();
                           int $$9 = azf.a($$8.a(awq.i.b(awq.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jf $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dus $$12 = $$0.a_($$11);
                              eqt $$13 = $$0.b_($$11);
                              if (deu.a($$0, $$11, $$12, $$13, bty.ay)) {
                                 bvf $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    clf $$17 = bty.ay.a($$0, btx.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, btx.a, $$14);
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
