import javax.annotation.Nullable;

public class cub extends csx {
   public static final int a = 5;
   public static final dgl b = dgb.au;
   protected static final eii c = csx.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   private final cuc d;

   protected cub(cuc $$0, dfk.d $$1) {
      super($$1);
      this.d = $$0;
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(b) < 5;
   }

   @Override
   public eii b_(dfl $$0, cpd $$1, gw $$2) {
      return c;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      gw $$4 = $$2.c();
      if ($$1.t($$4) && $$4.v() < $$1.aj()) {
         int $$5 = $$0.c(b);
         if ($$5 < 5) {
            boolean $$6 = false;
            boolean $$7 = false;
            dfl $$8 = $$1.a_($$2.d());
            if ($$8.a(csy.fz)) {
               $$6 = true;
            } else if ($$8.a(this.d)) {
               int $$9 = 1;

               for (int $$10 = 0; $$10 < 4; $$10++) {
                  dfl $$11 = $$1.a_($$2.c($$9 + 1));
                  if (!$$11.a(this.d)) {
                     if ($$11.a(csy.fz)) {
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
               $$1.a($$2, this.d.a($$1, $$2), 2);
               this.a($$1, $$4, $$5);
            } else if ($$5 < 4) {
               int $$12 = $$3.a(4);
               if ($$7) {
                  $$12++;
               }

               boolean $$13 = false;

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  hc $$15 = hc.c.a.a($$3);
                  gw $$16 = $$2.a($$15);
                  if ($$1.t($$16) && $$1.t($$16.d()) && b($$1, $$16, $$15.g())) {
                     this.a($$1, $$16, $$5 + 1);
                     $$13 = true;
                  }
               }

               if ($$13) {
                  $$1.a($$2, this.d.a($$1, $$2), 2);
               } else {
                  this.a($$1, $$2);
               }
            } else {
               this.a($$1, $$2);
            }
         }
      }
   }

   private void a(cpx $$0, gw $$1, int $$2) {
      $$0.a($$1, this.n().a(b, Integer.valueOf($$2)), 2);
      $$0.c(1033, $$1, 0);
   }

   private void a(cpx $$0, gw $$1) {
      $$0.a($$1, this.n().a(b, Integer.valueOf(5)), 2);
      $$0.c(1034, $$1, 0);
   }

   private static boolean b(cqa $$0, gw $$1, @Nullable hc $$2) {
      for (hc $$3 : hc.c.a) {
         if ($$3 != $$2 && !$$0.t($$1.a($$3))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 != hc.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.d());
      if (!$$3.a(this.d) && !$$3.a(csy.fz)) {
         if (!$$3.i()) {
            return false;
         } else {
            boolean $$4 = false;

            for (hc $$5 : hc.c.a) {
               dfl $$6 = $$1.a_($$2.a($$5));
               if ($$6.a(this.d)) {
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
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   public static void a(cpy $$0, gw $$1, ase $$2, int $$3) {
      $$0.a($$1, ((cuc)csy.ku).a($$0, $$1), 2);
      a($$0, $$1, $$2, $$1, $$3, 0);
   }

   private static void a(cpy $$0, gw $$1, ase $$2, gw $$3, int $$4, int $$5) {
      cuc $$6 = (cuc)csy.ku;
      int $$7 = $$2.a(4) + 1;
      if ($$5 == 0) {
         $$7++;
      }

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         gw $$9 = $$1.b($$8 + 1);
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
            hc $$13 = hc.c.a.a($$2);
            gw $$14 = $$1.b($$7).a($$13);
            if (Math.abs($$14.u() - $$3.u()) < $$4 && Math.abs($$14.w() - $$3.w()) < $$4 && $$0.t($$14) && $$0.t($$14.d()) && b($$0, $$14, $$13.g())) {
               $$10 = true;
               $$0.a($$14, $$6.a($$0, $$14), 2);
               $$0.a($$14.a($$13.g()), $$6.a($$0, $$14.a($$13.g())), 2);
               a($$0, $$14, $$2, $$3, $$4, $$5 + 1);
            }
         }
      }

      if (!$$10) {
         $$0.a($$1.b($$7), csy.kv.n().a(b, Integer.valueOf(5)), 2);
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, ehl $$2, cco $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.ag().a(apx.e)) {
         $$0.a($$4, true, $$3);
      }
   }
}
