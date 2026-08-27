public class dsc implements cvr {
   private int a;

   @Override
   public int a(apa $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.Z().b(cwa.C)) {
         return 0;
      } else {
         awt $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + (60 + $$3.a(60)) * 20;
            if ($$0.C_() < 5 && $$0.E_().g()) {
               return 0;
            } else {
               int $$4 = 0;

               for (apb $$5 : $$0.x()) {
                  if (!$$5.P_()) {
                     ib $$6 = $$5.dj();
                     if (!$$0.E_().g() || $$6.v() >= $$0.A_() && $$0.h($$6)) {
                        bmj $$7 = $$0.d_($$6);
                        if ($$7.a($$3.i() * 3.0F)) {
                           atv $$8 = $$5.H();
                           int $$9 = awm.a($$8.a(atz.i.b(atz.n)), 1, Integer.MAX_VALUE);
                           int $$10 = 24000;
                           if ($$3.a($$9) >= 72000) {
                              ib $$11 = $$6.b(20 + $$3.a(15)).g(-10 + $$3.a(21)).e(-10 + $$3.a(21));
                              dme $$12 = $$0.a_($$11);
                              ehr $$13 = $$0.b_($$11);
                              if (cwp.a($$0, $$11, $$12, $$13, bol.aw)) {
                                 bpp $$14 = null;
                                 int $$15 = 1 + $$3.a($$7.a().a() + 1);

                                 for (int $$16 = 0; $$16 < $$15; $$16++) {
                                    cfi $$17 = bol.aw.a((cwe)$$0);
                                    if ($$17 != null) {
                                       $$17.a($$11, 0.0F, 0.0F);
                                       $$14 = $$17.a($$0, $$7, bpb.a, $$14);
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
