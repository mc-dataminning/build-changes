import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends dih implements dib, doz {
   public static final MapCodec<dov> a = b(dov::new);
   public static final int b = 4;
   public static final dwd c = dvt.aS;
   public static final dvu d = dvt.C;
   protected static final fab e = dhy.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final fab f = dhy.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final fab g = dhy.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final fab h = dhy.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ere $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == erf.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dvd $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return !$$0.g($$1, $$2).a(jl.b).c() || $$0.c($$1, $$2, jl.b);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
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
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awz.ar);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
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
               jg $$14 = new jg($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dia.G)) {
                  dvd $$15 = $$0.a_($$14.e());
                  if ($$15.a(awz.ar)) {
                     $$0.a($$14, dia.mV.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
