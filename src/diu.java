import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diu extends dch implements dcb, diy {
   public static final MapCodec<diu> a = b(diu::new);
   public static final int b = 4;
   public static final dpz c = dpp.aS;
   public static final dpq d = dpp.C;
   protected static final est e = dby.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final est f = dby.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final est g = dby.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final est h = dby.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   protected diu(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eks $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ekt.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(doz $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return !$$0.k($$1, $$2).a(ih.b).c() || $$0.d($$1, $$2, ih.b);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
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
   protected eks c_(doz $$0) {
      return $$0.c(d) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avc.aq)) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dca.G)) {
                     doz $$15 = $$0.a_($$14.d());
                     if ($$15.a(avc.aq)) {
                        $$0.a($$14, dca.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
