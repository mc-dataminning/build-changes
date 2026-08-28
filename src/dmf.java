import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmf extends dfr implements dfl, dmj {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final int b = 4;
   public static final dtl c = dtb.aS;
   public static final dtc d = dtb.C;
   protected static final exa e = dfi.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final exa f = dfi.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final exa g = dfi.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final exa h = dfi.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eoj $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eok.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dsl $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return !$$0.k($$1, $$2).a(jf.b).c() || $$0.d($$1, $$2, jf.b);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfk.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eok.c, eok.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dfk.G)) {
                     dsl $$15 = $$0.a_($$14.d());
                     if ($$15.a(avw.aq)) {
                        $$0.a($$14, dfk.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
