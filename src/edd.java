public class edd implements dfu {
   private int a;

   @Override
   public int a(ard $$0, boolean $$1, boolean $$2) {
      if (!$$1) {
         return 0;
      } else if (!$$0.O().b(dge.L)) {
         return 0;
      } else {
         azh $$3 = $$0.A;
         this.a--;
         if (this.a > 0) {
            return 0;
         } else {
            this.a = this.a + 12000 + $$3.a(1200);
            long $$4 = $$0.ae() / 24000L;
            if ($$4 < 5L || !$$0.V()) {
               return 0;
            } else if ($$3.a(5) != 0) {
               return 0;
            } else {
               int $$5 = $$0.z().size();
               if ($$5 < 1) {
                  return 0;
               } else {
                  cox $$6 = $$0.z().get($$3.a($$5));
                  if ($$6.Z_()) {
                     return 0;
                  } else if ($$0.a($$6.dv(), 2)) {
                     return 0;
                  } else {
                     int $$7 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     int $$8 = (24 + $$3.a(24)) * ($$3.h() ? -1 : 1);
                     ji.a $$9 = $$6.dv().k().e($$7, 0, $$8);
                     int $$10 = 10;
                     if (!$$0.b($$9.u() - 10, $$9.w() - 10, $$9.u() + 10, $$9.w() + 10)) {
                        return 0;
                     } else {
                        jr<dhk> $$11 = $$0.t($$9);
                        if ($$11.a(awo.ag)) {
                           return 0;
                        } else {
                           int $$12 = 0;
                           int $$13 = (int)Math.ceil((double)$$0.d_($$9).b()) + 1;

                           for (int $$14 = 0; $$14 < $$13; $$14++) {
                              $$12++;
                              $$9.q($$0.a(ecs.a.f, $$9).v());
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

   private boolean a(ard $$0, ji $$1, azh $$2, boolean $$3) {
      dwx $$4 = $$0.a_($$1);
      if (!dgt.a($$0, $$1, $$4, $$4.y(), bus.aT)) {
         return false;
      } else if (!clz.b(bus.aT, $$0, bur.p, $$1, $$2)) {
         return false;
      } else {
         clz $$5 = bus.aT.a($$0, bur.p);
         if ($$5 != null) {
            if ($$3) {
               $$5.x(true);
               $$5.gz();
            }

            $$5.a_((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            $$5.a($$0, $$0.d_($$1), bur.p, null);
            $$0.a_($$5);
            return true;
         } else {
            return false;
         }
      }
   }
}
