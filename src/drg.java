public class drg implements cve {
   private int a;

   @Override
   public int a(aow $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.Z().b(cvn.K)) {
         return 0;
      } else {
         awp $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + 12000 + $$3.a(1200);
            long $$4 = $$0.Y() / 24000L;
            if ($$4 < 5L || !$$0.P()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.x().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  chl $$6 = $$0.x().get($$3.a($$5));
                  if ($$6.P_()) {
                     return 0;
                  } else if ($$0.a($$6.dm(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     hz.a $$9 = $$6.dm().j().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        ij<cwq> $$11 = $$0.t($$9);
                        if ($$11.a(atz.ag)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(dqv.a.f, $$9).v());
                              if ($$14 == 0) {
                                 if (!this.a($$0, $$9, $$3, true)) {
                                    break;
                                 }
                              } else {
                                 this.a($$0, $$9, $$3, false);
                              }

                              $$9.p($$9.u() + $$3.a(5) - $$3.a(5));
                              $$9.r($$9.w() + $$3.a(5) - $$3.a(5));
                           }

                           return $$12;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(aow $$0, hz $$1, awp $$2, boolean $$3) {
      dlj $$4 = $$0.a_($$1);
      if (!cwc.a($$0, $$1, $$4, $$4.u(), bnw.aA)) {
         return false;
      } else if (!ces.b(bnw.aA, $$0, bom.p, $$1, $$2)) {
         return false;
      } else {
         ces $$5 = bnw.aA.a((cvr)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.go();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bom.p, null, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
