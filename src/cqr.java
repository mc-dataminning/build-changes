import javax.annotation.Nullable;

public class cqr extends cpn {
   public static final int a = 5;
   public static final ddb b = dcr.au;
   private final cqs c;

   protected cqr(cqs $$0, dca.d $$1) {
      super($$1);
      this.c = $$0;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.c(b) < 5;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      gu $$4 = $$2.c();
      if ($$1.t($$4) && $$4.v() < $$1.aj()) {
         int $$5 = $$0.c(b);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dcb $$8 = $$1.a_($$2.d());
            if ($$8.a(cpo.fz)) {
               $$6 = true;
            } else if ($$8.a(this.c)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dcb $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.c)) {
                     if ($$11.a(cpo.fz)) {
                        $$7 = true;
                     }
                     break;
                  }

                  $$9++;
               }

               if ($$9 < 2 || $$9 <= $$3.a($$7 ? 5 : 4)) {
                  $$6 = true;
               }
            } else if ($$8.i()) {
               $$6 = true;
            }

            if ($$6 && b($$1, $$4, null) && $$1.t($$2.b(2))) {
               $$1.a($$2, this.c.a($$1, $$2), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  ha $$15 = ha.c.a.a($$3);
                  gu $$16 = $$2.a($$15);
                  if ($$1.t($$16) && $$1.t($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, this.c.a($$1, $$2), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(cmm $$0, gu $$1, int $$2) {
      $$0.a($$1, this.n().a(b, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cmm $$0, gu $$1) {
      $$0.a($$1, this.n().a(b, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(cmp $$0, gu $$1, @Nullable ha $$2) {
      for (ha $$3 : ha.c.a) {
         if ($$3 != $$2 && !$$0.t($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 != ha.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.c) && !$$3.a(cpo.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (ha $$5 : ha.c.a) {
               dcb $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.c)) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else if (!$$6.i()) {
                  return false;
               }
            }

            return $$4;
         }
      } else {
         return true;
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   public static void a(cmn $$0, gu $$1, apf $$2, int $$3) {
      $$0.a($$1, ((cqs)cpo.ku).a($$0, $$1), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(cmn $$0, gu $$1, apf $$2, gu $$3, int $$4, int $$5) {
      cqs $$6 = (cqs)cpo.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gu $$9 = $$1.b($$8 + 1);
         if (!b($$0, $$9, null)) {
            return;
         }

         $$0.a($$9, $$6.a($$0, $$9), 2);
         $$0.a($$9.d(), $$6.a($$0, $$9.d()), 2);
      }

      boolean $$10 = false;
      if ($$5 < 4) {
         int $$11 = $$2.a(4);
         if ($$5 == 0) {
            $$11++;
         }

         for (int $$12 = 0; $$12 < $$11; $$12++) {
            ha $$13 = ha.c.a.a($$2);
            gu $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.t($$14) && $$0.t($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, $$6.a($$0, $$14), 2);
               $$0.a($$14.a($$13.g()), $$6.a($$0, $$14.a($$13.g())), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), cpo.kv.n().a(b, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.ae().a(amz.e)) {
         $$0.a($$4, true, $$3);
      }
   }
}
