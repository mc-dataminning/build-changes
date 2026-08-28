import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends dhy implements dib {
   public static final MapCodec<dhc> a = b(dhc::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fab e = dhy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fab f = dhy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fab g = dhy.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dwd h = dvt.aq;
   public static final dwb<dvp> i = dvt.bk;
   public static final dwd j = dvt.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dvp.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return true;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      fab $$4 = $$0.c(i) == dvp.c ? f : e;
      ezh $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      ezh $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dvd $$0, dea $$1, jg $$2) {
      return false;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dvd $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(awz.av)) {
            if ($$2.a(dia.mY)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dia.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dvd $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dia.mZ) ? this.m().b(h, $$4.c(h)) : dia.mY.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(j) == 0) {
         if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            int $$4 = this.b($$1, $$2) + 1;
            if ($$4 < 16) {
               this.a($$0, $$1, $$2, $$3, $$4);
            }
         }
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).a(awz.av);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jl.b && $$2.a(dia.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jg $$9 = $$2.b($$4);
         dvd $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dvd $$0, coh $$1, dea $$2, jg $$3) {
      return $$1.fb().h() instanceof cxl ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dvd $$0, dev $$1, jg $$2, azr $$3, int $$4) {
      dvd $$5 = $$1.a_($$2.e());
      jg $$6 = $$2.c(2);
      dvd $$7 = $$1.a_($$6);
      dvp $$8 = dvp.a;
      if ($$4 >= 1) {
         if (!$$5.a(dia.mZ) || $$5.c(i) == dvp.a) {
            $$8 = dvp.b;
         } else if ($$5.a(dia.mZ) && $$5.c(i) != dvp.a) {
            $$8 = dvp.c;
            if ($$7.a(dia.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dvp.b), 3);
               $$1.a($$6, $$7.b(i, dvp.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dia.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(dea $$0, jg $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dia.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(dea $$0, jg $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dia.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
