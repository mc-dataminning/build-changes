public class dkt implements cox {
   private int a;

   @Override
   public int a(aki $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cpg.A)) {
         return 0;
      } else {
         art $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.v_() < 5 && $$0.x_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (akj $$5 : $$0.v()) {
                  if (!$$5.G_()) {
                     gv $$6 = $$5.dk();
                     if (!$$0.x_().g() || $$6.v() >= $$0.t_() && $$0.g($$6)) {
                        bgm $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           apa $$8 = $$5.E();
                           int $$9 = aro.a($$8.a(ape.i.b(ape.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              gv $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dey $$12 = $$0.a_($$11);
                              eab $$13 = $$0.b_($$11);
                              if (cpv.a($$0, $$11, $$12, $$13, bik.au)) {
                                 bjq $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    bzb $$17 = bik.au.a((cpk)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bja.a, $$14, null);
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
