import com.mojang.serialization.MapCodec;

public class dik extends dhy {
   public static final MapCodec<dik> a = b(dik::new);
   public static final int b = 6;
   public static final dwd c = dvt.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fab[] g = new fab[]{
      dhy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhy.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dik> a() {
      return a;
   }

   protected dik(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      cvt $$7 = $$0.h();
      if ($$0.a(axi.aK) && $$1.c(c) == 0 && dhy.a($$7) instanceof din $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awk.ds, awl.e, 1.0F, 1.0F);
         $$2.b($$3, dio.a($$8));
         $$2.a($$4, eaa.c, $$3);
         $$4.b(awu.c.b($$7));
         return bry.a;
      } else {
         return bry.f;
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bry.a;
         }

         if ($$3.b(brx.a).f()) {
            return bry.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bry a(dew $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$3.u(false)) {
         return bry.e;
      } else {
         $$3.a(awu.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eaa.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eaa.f, $$1);
         }

         return bry.a;
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
