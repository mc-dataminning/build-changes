import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dgf implements dfz, dmy {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final int b = 4;
   public static final dua c = dtq.aS;
   public static final dtr d = dtq.C;
   protected static final exp e = dfw.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final exp f = dfw.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final exp g = dfw.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final exp h = dfw.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eoy $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eoz.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dta $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return !$$0.k($$1, $$2).a(ji.b).c() || $$0.d($$1, $$2, ji.b);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(awd.aq)) {
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
                  jd $$14 = new jd($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dfy.G)) {
                     dta $$15 = $$0.a_($$14.d());
                     if ($$15.a(awd.aq)) {
                        $$0.a($$14, dfy.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
