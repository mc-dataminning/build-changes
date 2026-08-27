public class dld implements cpi {
   private int a;

   @Override
   public int a(akq $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.X().b(cpr.G)) {
         return 0;
      } else {
         asc $$3 = $$0.z;
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
                  cbu $$6 = $$0.v().get($$3.a($$5));
                  if ($$6.M_()) {
                     return 0;
                  } else if ($$0.a($$6.dl(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     gw.a $$9 = $$6.dl().j().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        he<cqt> $$11 = $$0.s($$9);
                        if ($$11.a(apr.af)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(dks.a.f, $$9).v());
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

   private boolean a(akq $$0, gw $$1, asc $$2, boolean $$3) {
      dfj $$4 = $$0.a_($$1);
      if (!cqg.a($$0, $$1, $$4, $$4.u(), biu.ay)) {
         return false;
      } else if (!bzj.b(biu.ay, $$0, bjk.p, $$1, $$2)) {
         return false;
      } else {
         bzj $$5 = biu.ay.a((cpv)$$0);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gl();
            }

            $$5.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bjk.p, null, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
