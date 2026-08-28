public class egj implements dii {
   private int a;

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(dir.L)) {
            azv $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + 12000 + $$3.a(1200);
               long $$4 = $$0.af() / 24000L;
               if ($$4 >= 5L && $$0.V()) {
                  if ($$3.a(5) == 0) {
                     int $$5 = $$0.z().size();
                     if ($$5 >= 1) {
                        cqy $$6 = $$0.z().get($$3.a($$5));
                        if (!$$6.U_()) {
                           if (!$$0.a($$6.dv(), 2)) {
                              int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                              int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                              iu.a $$9 = $$6.dv().k().e($$7, 0, $$8);
                              int $$10 = 10;
                              if ($$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                                 je<djy> $$11 = $$0.u($$9);
                                 if (!$$11.a(axb.ag)) {
                                    int $$12 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                                    for (int $$13 = 0; $$13 < $$12; $$13++) {
                                       $$9.q($$0.a(efy.a.f, $$9).v());
                                       if ($$13 == 0) {
                                          if (!this.a($$0, $$9, $$3, true)) {
                                             break;
                                          }
                                       } else {
                                          this.a($$0, $$9, $$3, false);
                                       }

                                       $$9.p($$9.u() + $$3.a(5) - $$3.a(5));
                                       $$9.r($$9.w() + $$3.a(5) - $$3.a(5));
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(arq $$0, iu $$1, azv $$2, boolean $$3) {
      dzz $$4 = $$0.a_($$1);
      if (!djg.a($$0, $$1, $$4, $$4.y(), bwm.aT)) {
         return false;
      } else if (!coa.b(bwm.aT, $$0, bwl.p, $$1, $$2)) {
         return false;
      } else {
         coa $$5 = bwm.aT.a($$0, bwl.p);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gv();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bwl.p, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
