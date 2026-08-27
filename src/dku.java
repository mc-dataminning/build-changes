public class dku implements coz {
   private int a;

   @Override
   public int a(akk $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cpi.G)) {
         return 0;
      } else {
         aru $$3 = $$0.z;
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
                  cbn $$6 = $$0.v().get($$3.a($$5));
                  if ($$6.G_()) {
                     return 0;
                  } else if ($$0.a($$6.dk(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     gu.a $$9 = $$6.dk().j().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        he<cqk> $$11 = $$0.s($$9);
                        if ($$11.a(apk.af)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(dkj.a.f, $$9).v());
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

   private boolean a(akk $$0, gu $$1, aru $$2, boolean $$3) {
      dfa $$4 = $$0.a_($$1);
      if (!cpx.a($$0, $$1, $$4, $$4.u(), bim.ay)) {
         return false;
      } else if (!bzc.b(bim.ay, $$0, bjc.p, $$1, $$2)) {
         return false;
      } else {
         bzc $$5 = bim.ay.a((cpm)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gh();
            }

            $$5.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bjc.p, null, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
