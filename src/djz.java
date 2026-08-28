import com.mojang.serialization.MapCodec;

public class djz extends din implements dih {
   public static final MapCodec<djz> d = b(djz::new);
   public static final int e = 7;
   public static final dwj f = dvz.av;
   private static final fah[] a = new fah[]{
      die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends djz> a() {
      return d;
   }

   protected djz(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.cC);
   }

   protected dwj b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dvj $$0) {
      return $$0.c(this.b());
   }

   public dvj b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dvj $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dvj $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.h($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(dfb $$0, jh $$1, dvj $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dfb $$0) {
      return azk.a($$0.A, 2, 5);
   }

   protected static float a(die $$0, deg $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dvj $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dig.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dla.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jh $$9 = $$2.f();
      jh $$10 = $$2.g();
      jh $$11 = $$2.h();
      jh $$12 = $$2.i();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.f()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$12.g()).a($$0) || $$1.a_($$11.g()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dfe $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3 instanceof clw && $$1.ac().b(dex.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dfa d() {
      return cwf.pw;
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(this.d());
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      this.a((dfb)$$0, $$2, $$3);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f);
   }
}
