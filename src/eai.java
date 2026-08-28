public class eai implements dde {
   private int a;

   @Override
   public int a(arg $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ac().b(ddo.C)) {
         return 0;
      } else {
         azk $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.z_() < 5 && $$0.B_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (arh $$5 : $$0.x()) {
                  if (!$$5.P_()) {
                     je $$6 = $$5.ds();
                     if (!$$0.B_().g() || $$6.v() >= $$0.N() && $$0.h($$6)) {
                        bri $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           awj $$8 = $$5.J();
                           int $$9 = azc.a($$8.a(awn.i.b(awn.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              je $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dua $$12 = $$0.a_($$11);
                              eqb $$13 = $$0.b_($$11);
                              if (ded.a($$0, $$11, $$12, $$13, btq.ay)) {
                                 bux $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    ckx $$17 = btq.ay.a($$0, btp.a);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, btp.a, $$14);
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
