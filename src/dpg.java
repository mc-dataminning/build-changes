import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpg extends dis implements dim, dpk {
   public static final MapCodec<dpg> a = b(dpg::new);
   public static final int b = 4;
   public static final dwn c = dwe.aS;
   public static final dwf d = dwe.C;
   protected static final fal e = dij.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final fal f = dij.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final fal g = dij.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final fal h = dij.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ero $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erp.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dvo $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return !$$0.g($$1, $$2).a(jm.b).c() || $$0.c($$1, $$2, jm.b);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dil.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axd.as);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
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
               jh $$14 = new jh($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dil.G)) {
                  dvo $$15 = $$0.a_($$14.e());
                  if ($$15.a(axd.as)) {
                     $$0.a($$14, dil.mV.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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

      $$0.a($$2, $$3.b(c, Integer.valueOf(4)), 2);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
