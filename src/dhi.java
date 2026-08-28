import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends die implements dih {
   public static final MapCodec<dhi> a = b(dhi::new);
   protected static final float b = 3.0F;
   protected static final float c = 5.0F;
   protected static final float d = 1.5F;
   protected static final fah e = die.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final fah f = die.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final fah g = die.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final dwj h = dvz.aq;
   public static final dwh<dvv> i = dvz.bk;
   public static final dwj j = dvz.aU;
   public static final int k = 16;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 0;
   public static final int o = 1;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(h, Integer.valueOf(0)).b(i, dvv.a).b(j, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(h, i, j);
   }

   @Override
   protected boolean e_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      fah $$4 = $$0.c(i) == dvv.c ? f : e;
      ezn $$5 = $$0.a($$2);
      return $$4.a($$5.d, $$5.e, $$5.f);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      ezn $$4 = $$0.a($$2);
      return g.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a_(dvj $$0, deg $$1, jh $$2) {
      return false;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      if (!$$1.c()) {
         return null;
      } else {
         dvj $$2 = $$0.q().a_($$0.a().e());
         if ($$2.a(axa.av)) {
            if ($$2.a(dig.mY)) {
               return this.m().b(h, Integer.valueOf(0));
            } else if ($$2.a(dig.mZ)) {
               int $$3 = $$2.c(h) > 0 ? 1 : 0;
               return this.m().b(h, Integer.valueOf($$3));
            } else {
               dvj $$4 = $$0.q().a_($$0.a().d());
               return $$4.a(dig.mZ) ? this.m().b(h, $$4.c(h)) : dig.mY.m();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(j) == 0;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
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
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axa.av);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$1 == jm.b && $$2.a(dig.mZ) && $$2.c(h) > $$0.c(h)) {
         $$3.a($$4, $$0.a(h), 2);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b($$0, $$1);
      return $$3 + $$4 + 1 < 16 && $$0.a_($$1.b($$3)).c(j) != 1;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      int $$4 = this.a($$0, $$2);
      int $$5 = this.b($$0, $$2);
      int $$6 = $$4 + $$5 + 1;
      int $$7 = 1 + $$1.a(2);

      for (int $$8 = 0; $$8 < $$7; $$8++) {
         jh $$9 = $$2.b($$4);
         dvj $$10 = $$0.a_($$9);
         if ($$6 >= 16 || $$10.c(j) == 1 || !$$0.u($$9.d())) {
            return;
         }

         this.a($$10, $$0, $$9, $$1, $$6);
         $$4++;
         $$6++;
      }
   }

   @Override
   protected float a(dvj $$0, com $$1, deg $$2, jh $$3) {
      return $$1.fb().h() instanceof cxp ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, azs $$3, int $$4) {
      dvj $$5 = $$1.a_($$2.e());
      jh $$6 = $$2.c(2);
      dvj $$7 = $$1.a_($$6);
      dvv $$8 = dvv.a;
      if ($$4 >= 1) {
         if (!$$5.a(dig.mZ) || $$5.c(i) == dvv.a) {
            $$8 = dvv.b;
         } else if ($$5.a(dig.mZ) && $$5.c(i) != dvv.a) {
            $$8 = dvv.c;
            if ($$7.a(dig.mZ)) {
               $$1.a($$2.e(), $$5.b(i, dvv.b), 3);
               $$1.a($$6, $$7.b(i, dvv.a), 3);
            }
         }
      }

      int $$9 = $$0.c(h) != 1 && !$$7.a(dig.mZ) ? 0 : 1;
      int $$10 = ($$4 < 11 || !($$3.i() < 0.25F)) && $$4 != 15 ? 0 : 1;
      $$1.a($$2.d(), this.m().b(h, Integer.valueOf($$9)).b(i, $$8).b(j, Integer.valueOf($$10)), 3);
   }

   protected int a(deg $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.b($$2 + 1)).a(dig.mZ)) {
         $$2++;
      }

      return $$2;
   }

   protected int b(deg $$0, jh $$1) {
      int $$2 = 0;

      while ($$2 < 16 && $$0.a_($$1.c($$2 + 1)).a(dig.mZ)) {
         $$2++;
      }

      return $$2;
   }
}
