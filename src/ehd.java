public class ehd implements diy {
   private int a;

   @Override
   public void a(arq $$0, boolean $$1, boolean $$2) {
      if ($$1) {
         if ($$0.O().c(dji.M)) {
            azv $$3 = $$0.A;
            this.a--;
            if (this.a <= 0) {
               this.a = this.a + 12000 + $$3.a(1200);
               long $$4 = $$0.af() / 24000L;
               if ($$4 >= 5L && $$0.V()) {
                  if ($$3.a(5) == 0) {
                     int $$5 = $$0.z().size();
                     if ($$5 >= 1) {
                        crm $$6 = $$0.z().get($$3.a($$5));
                        if (!$$6.V_()) {
                           if (!$$0.a($$6.du(), 2)) {
                              int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                              int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                              iv.a $$9 = $$6.du().k().e($$7, 0, $$8);
                              int $$10 = 10;
                              if ($$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                                 jf<dkp> $$11 = $$0.u($$9);
                                 if (!$$11.a(axb.ag)) {
                                    int $$12 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                                    for (int $$13 = 0; $$13 < $$12; $$13++) {
                                       $$9.q($$0.a(egs.a.f, $$9).v());
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

   private boolean a(arq $$0, iv $$1, azv $$2, boolean $$3) {
      eat $$4 = $$0.a_($$1);
      if (!djx.a($$0, $$1, $$4, $$4.y(), bwr.aT)) {
         return false;
      } else if (!cop.b(bwr.aT, $$0, bwq.p, $$1, $$2)) {
         return false;
      } else {
         cop $$5 = bwr.aT.a($$0, bwq.p);
         if ($$5 != null) {
            if ($$3) {
               $$5.w(true);
               $$5.gy();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bwq.p, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
