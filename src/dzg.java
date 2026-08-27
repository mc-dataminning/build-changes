public class dzg implements dbn {
   private int a;

   @Override
   public int a(aqt $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ab().b(dbw.D)) {
         return 0;
      } else {
         ayt $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.C_() < 5 && $$0.E_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (aqu $$5 : $$0.x()) {
                  if (!$$5.O_()) {
                     ir $$6 = $$5.du();
                     if (!$$0.E_().g() || $$6.v() >= $$0.A_() && $$0.h($$6)) {
                        bpy $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           avv $$8 = $$5.J();
                           int $$9 = aym.a($$8.a(avz.i.b(avz.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              ir $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dtc $$12 = $$0.a_($$11);
                              epe $$13 = $$0.b_($$11);
                              if (dcl.a($$0, $$11, $$12, $$13, bsb.az)) {
                                 btg $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cjf $$17 = bsb.az.a((dca)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bss.a, $$14);
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
