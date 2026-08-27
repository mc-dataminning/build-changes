public class dvm implements cyt {
   private int a;

   @Override
   public int a(apu $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.aa().b(czc.C)) {
         return 0;
      } else {
         axt $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (apv $$5 : $$0.x()) {
                  if (!$$5.N_()) {
                     id $$6 = $$5.dm();
                     if (!$$0.D_().g() || $$6.v() >= $$0.z_() && $$0.h($$6)) {
                        bod $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           auu $$8 = $$5.H();
                           int $$9 = axm.a($$8.a(auz.i.b(auz.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              id $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dpi $$12 = $$0.a_($$11);
                              elb $$13 = $$0.b_($$11);
                              if (czr.a($$0, $$11, $$12, $$13, bqg.ax)) {
                                 brl $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    chi $$17 = bqg.ax.a((czg)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bqx.a, $$14);
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
