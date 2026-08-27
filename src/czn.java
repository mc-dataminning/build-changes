import javax.annotation.Nullable;

public class czn extends csy implements css, czr {
   public static final int a = 4;
   public static final dge b = dfu.aS;
   public static final dfv c = dfu.C;
   protected static final eib d = csq.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eib e = csq.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eib f = csq.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eib g = csq.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected czn(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)).a(c, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(b, Integer.valueOf(Math.min(4, $$1.c(b) + 1)));
      } else {
         eah $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eai.c;
         return super.a($$0).a(c, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dfe $$0) {
      return !$$0.c(c);
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return !$$0.k($$1, $$2).a(hc.b).c() || $$0.d($$1, $$2, hc.b);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return csr.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eai.c, eai.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(b) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
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
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(apo.ap)) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(csr.G)) {
                     dfe $$15 = $$0.a_($$14.d());
                     if ($$15.a(apo.ap)) {
                        $$0.a($$14, csr.mV.n().a(b, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
