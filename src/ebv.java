public class ebv implements der {
   private int a;

   @Override
   public int a(arq $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ac().b(dfb.C)) {
         return 0;
      } else {
         azv $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (arr $$5 : $$0.x()) {
                  if (!$$5.R_()) {
                     jh $$6 = $$5.dy();
                     if (!$$0.D_().g() || $$6.v() >= $$0.N() && $$0.h($$6)) {
                        bsf $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awu $$8 = $$5.J();
                           int $$9 = azn.a($$8.a(awy.i.b(awy.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jh $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dvo $$12 = $$0.a_($$11);
                              ero $$13 = $$0.b_($$11);
                              if (dfq.a($$0, $$11, $$12, $$13, bup.ay)) {
                                 bvx $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    clx $$17 = bup.ay.a($$0, buo.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, buo.a, $$14);
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
