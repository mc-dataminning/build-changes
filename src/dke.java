import com.mojang.serialization.MapCodec;

public class dke extends dis implements dim {
   public static final MapCodec<dke> d = b(dke::new);
   public static final int e = 7;
   public static final dwn f = dwe.av;
   private static final fal[] a = new fal[]{
      dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dke> a() {
      return d;
   }

   protected dke(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(dil.cC);
   }

   protected dwn b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dvo $$0) {
      return $$0.c(this.b());
   }

   public dvo b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dvo $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dvo $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
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

   public void a(dff $$0, jh $$1, dvo $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dff $$0) {
      return azn.a($$0.A, 2, 5);
   }

   protected static float a(dij $$0, dek $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dvo $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dil.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dlf.b) > 0) {
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
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dfi $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3 instanceof cma && $$1.ac().b(dfb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dfe d() {
      return cwj.pw;
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(this.d());
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      this.a((dff)$$0, $$2, $$3);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(f);
   }
}
