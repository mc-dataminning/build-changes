public class eeb implements dgu {
   private int a;

   @Override
   public int a(ash $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.N().b(dhe.L)) {
         return 0;
      } else {
         bam $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + 12000 + $$3.a(1200);
            long $$4 = $$0.ad() / 24000L;
            if ($$4 < 5L || !$$0.U()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.y().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  cpx $$6 = $$0.y().get($$3.a($$5));
                  if ($$6.aa_()) {
                     return 0;
                  } else if ($$0.a($$6.dw(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     jh.a $$9 = $$6.dw().k().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        jq<dik> $$11 = $$0.t($$9);
                        if ($$11.a(axt.ag)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(edq.a.f, $$9).v());
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

   private boolean a(ash $$0, jh $$1, bam $$2, boolean $$3) {
      dxv $$4 = $$0.a_($$1);
      if (!dht.a($$0, $$1, $$4, $$4.y(), bvr.aU)) {
         return false;
      } else if (!cmy.b(bvr.aU, $$0, bvq.p, $$1, $$2)) {
         return false;
      } else {
         cmy $$5 = bvr.aU.a($$0, bvq.p);
         if ($$5 != null) {
            if ($$3) {
               $$5.x(true);
               $$5.gv();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bvq.p, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
