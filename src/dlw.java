import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlw extends dfi implements dfc, dma {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final int b = 4;
   public static final dtc c = dss.aS;
   public static final dst d = dss.C;
   protected static final ewk e = dez.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ewk f = dez.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ewk g = dez.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ewk h = dez.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         env $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enw.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dsc $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return !$$0.k($$1, $$2).a(je.b).c() || $$0.d($$1, $$2, je.b);
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfb.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enw.c, enw.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsc $$0, cya $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
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
   protected env b_(dsc $$0) {
      return $$0.c(d) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return true;
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(awp.aq)) {
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
                  iz $$14 = new iz($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dfb.G)) {
                     dsc $$15 = $$0.a_($$14.d());
                     if ($$15.a(awp.aq)) {
                        $$0.a($$14, dfb.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
