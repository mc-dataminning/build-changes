import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends czo implements czi, dgf {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final int b = 4;
   public static final dne c = dmu.aS;
   public static final dmv d = dmu.C;
   protected static final epo e = czf.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final epo f = czf.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final epo g = czf.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final epo h = czf.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   protected dgb(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ehr $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ehs.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dme $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return !$$0.k($$1, $$2).a(ih.b).c() || $$0.d($$1, $$2, ih.b);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return czh.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ehs.c, ehs.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
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
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(aue.ap)) {
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
                  ib $$14 = new ib($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(czh.G)) {
                     dme $$15 = $$0.a_($$14.d());
                     if ($$15.a(aue.ap)) {
                        $$0.a($$14, czh.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
