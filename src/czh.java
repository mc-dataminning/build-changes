import javax.annotation.Nullable;

public class czh extends css implements csm, czl {
   public static final int a = 4;
   public static final dfy b = dfo.aS;
   public static final dfp c = dfo.C;
   protected static final ehy d = csk.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ehy e = csk.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ehy f = csk.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ehy g = csk.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected czh(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)).a(c, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(b, Integer.valueOf(Math.min(4, $$1.c(b) + 1)));
      } else {
         eab $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eac.c;
         return super.a($$0).a(c, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dey $$0) {
      return !$$0.c(c);
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return !$$0.k($$1, $$2).a(hb.b).c() || $$0.d($$1, $$2, hb.b);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         return csl.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(b) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
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
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(apj.ap)) {
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
                  gv $$14 = new gv($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(csl.G)) {
                     dey $$15 = $$0.a_($$14.d());
                     if ($$15.a(apj.ap)) {
                        $$0.a($$14, csl.mV.n().a(b, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
