public class dmq implements crf {
   private int a;

   @Override
   public int a(ama $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cro.K)) {
         return 0;
      } else {
         ato $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + 12000 + $$3.a(1200);
            long $$4 = $$0.W() / 24000L;
            if ($$4 < 5L || !$$0.N()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.v().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  cdm $$6 = $$0.v().get($$3.a($$5));
                  if ($$6.N_()) {
                     return 0;
                  } else if ($$0.a($$6.dl(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     ht.a $$9 = $$6.dl().j().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        ib<csq> $$11 = $$0.s($$9);
                        if ($$11.a(arb.af)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(dmf.a.f, $$9).v());
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

   private boolean a(ama $$0, ht $$1, ato $$2, boolean $$3) {
      dgw $$4 = $$0.a_($$1);
      if (!csd.a($$0, $$1, $$4, $$4.u(), bkm.ay)) {
         return false;
      } else if (!cbb.b(bkm.ay, $$0, blc.p, $$1, $$2)) {
         return false;
      } else {
         cbb $$5 = bkm.ay.a((crs)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gm();
            }

            $$5.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), blc.p, null, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
