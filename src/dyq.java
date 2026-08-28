public class dyq implements dbs {
   private int a;

   @Override
   public int a(aqm $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.ab().b(dcb.K)) {
         return 0;
      } else {
         ayo $$3 = $$0.z;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + 12000 + $$3.a(1200);
            long $$4 = $$0.aa() / 24000L;
            if ($$4 < 5L || !$$0.R()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.x().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  cmk $$6 = $$0.x().get($$3.a($$5));
                  if ($$6.N_()) {
                     return 0;
                  } else if ($$0.a($$6.dq(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     ja.a $$9 = $$6.dq().j().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        jj<ddf> $$11 = $$0.t($$9);
                        if ($$11.a(avv.ag)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(dyf.a.f, $$9).v());
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

   private boolean a(aqm $$0, ja $$1, ayo $$2, boolean $$3) {
      dsk $$4 = $$0.a_($$1);
      if (!dcq.a($$0, $$1, $$4, $$4.u(), bsm.aC)) {
         return false;
      } else if (!cjr.b(bsm.aC, $$0, btf.p, $$1, $$2)) {
         return false;
      } else {
         cjr $$5 = bsm.aC.a((dcf)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gw();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), btf.p, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
