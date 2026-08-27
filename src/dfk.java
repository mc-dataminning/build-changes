import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfk extends cyx implements cyr, dfo {
   public static final MapCodec<dfk> a = b(dfk::new);
   public static final int b = 4;
   public static final dmf c = dlv.aS;
   public static final dlw d = dlv.C;
   protected static final eol e = cyo.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eol f = cyo.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eol g = cyo.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eol h = cyo.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   protected dfk(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         egp $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == egq.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dlf $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return !$$0.k($$1, $$2).a(ie.b).c() || $$0.d($$1, $$2, ie.b);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         return cyq.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, egq.c, egq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
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
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      return true;
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(atz.ap)) {
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
                  hz $$14 = new hz($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cyq.G)) {
                     dlf $$15 = $$0.a_($$14.d());
                     if ($$15.a(atz.ap)) {
                        $$0.a($$14, cyq.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
