import com.mojang.serialization.MapCodec;

public class djt extends dih implements dib {
   public static final MapCodec<djt> d = b(djt::new);
   public static final int e = 7;
   public static final dwd f = dvt.av;
   private static final fab[] a = new fab[]{
      dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends djt> a() {
      return d;
   }

   protected djt(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(dia.cC);
   }

   protected dwd b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dvd $$0) {
      return $$0.c(this.b());
   }

   public dvd b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dvd $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dvd $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
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

   public void a(dev $$0, jg $$1, dvd $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dev $$0) {
      return azj.a($$0.A, 2, 5);
   }

   protected static float a(dhy $$0, dea $$1, jg $$2) {
      float $$3 = 1.0F;
      jg $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dvd $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dia.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dku.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jg $$9 = $$2.f();
      jg $$10 = $$2.g();
      jg $$11 = $$2.h();
      jg $$12 = $$2.i();
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
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dey $$0, jg $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3 instanceof clr && $$1.ac().b(der.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected deu d() {
      return cwb.pw;
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(this.d());
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.a((dev)$$0, $$2, $$3);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f);
   }
}
