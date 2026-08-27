import javax.annotation.Nullable;

public class czu extends ctf implements csz, czy {
   public static final int a = 4;
   public static final dgl b = dgb.aS;
   public static final dgc c = dgb.C;
   protected static final eii d = csx.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eii e = csx.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eii f = csx.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eii g = csx.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected czu(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)).a(c, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(b, Integer.valueOf(Math.min(4, $$1.c(b) + 1)));
      } else {
         eao $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eap.c;
         return super.a($$0).a(c, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dfl $$0) {
      return !$$0.c(c);
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return !$$0.k($$1, $$2).a(hc.b).c() || $$0.d($$1, $$2, hc.b);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return csy.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(b) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ($$0.c(b)) {
         case 1:
         default:
            return d;
         case 2:
            return e;
         case 3:
            return f;
         case 4:
            return g;
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return true;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(apu.ap)) {
         int $$4 = 5;
         int $$5 = 1;
         int $$6 = 2;
         int $$7 = 0;
         int $$8 = $$2.u() - 2;
         int $$9 = 0;

         for (int $$10 = 0; $$10 < 5; $$10++) {
            for (int $$11 = 0; $$11 < $$5; $$11++) {
               int $$12 = 2 + $$2.v() - 1;

               for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
                  gw $$14 = new gw($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(csy.G)) {
                     dfl $$15 = $$0.a_($$14.d());
                     if ($$15.a(apu.ap)) {
                        $$0.a($$14, csy.mV.n().a(b, Integer.valueOf($$1.a(4) + 1)), 3);
                     }
                  }
               }
            }

            if ($$7 < 2) {
               $$5 += 2;
               $$9++;
            } else {
               $$5 -= 2;
               $$9--;
            }

            $$7++;
         }

         $$0.a($$2, $$3.a(b, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
