public class ebr implements den {
   private int a;

   @Override
   public int a(arn $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ac().b(dex.C)) {
         return 0;
      } else {
         azs $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.B_() < 5 && $$0.D_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (aro $$5 : $$0.x()) {
                  if (!$$5.R_()) {
                     jh $$6 = $$5.dx();
                     if (!$$0.D_().g() || $$6.v() >= $$0.N() && $$0.h($$6)) {
                        bsb $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awr $$8 = $$5.J();
                           int $$9 = azk.a($$8.a(awv.i.b(awv.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              jh $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dvj $$12 = $$0.a_($$11);
                              erk $$13 = $$0.b_($$11);
                              if (dfm.a($$0, $$11, $$12, $$13, bul.ay)) {
                                 bvt $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    clt $$17 = bul.ay.a($$0, buk.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, buk.a, $$14);
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
