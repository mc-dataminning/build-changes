import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dfq implements dfk, dmi {
   public static final MapCodec<dme> a = b(dme::new);
   public static final int b = 4;
   public static final dtk c = dta.aS;
   public static final dtb d = dta.C;
   protected static final ewy e = dfh.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ewy f = dfh.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ewy g = dfh.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ewy h = dfh.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dme> a() {
      return a;
   }

   protected dme(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eoh $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eoi.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dsk $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return !$$0.k($$1, $$2).a(jf.b).c() || $$0.d($$1, $$2, jf.b);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfj.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eoi.c, eoi.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return true;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avw.aq)) {
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
                  ja $$14 = new ja($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dfj.G)) {
                     dsk $$15 = $$0.a_($$14.d());
                     if ($$15.a(avw.aq)) {
                        $$0.a($$14, dfj.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
