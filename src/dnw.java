import com.mojang.serialization.MapCodec;

public class dnw extends dvj implements dmd {
   public static final MapCodec<dnw> d = b(dnw::new);
   public static final int e = 7;
   public static final eaz f = eap.ay;
   private static final ffc[] a = dma.a(7, $$0 -> dma.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dnw> a() {
      return d;
   }

   protected dnw(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return $$0.a(dmc.cL);
   }

   protected eaz b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dzz $$0) {
      return $$0.c(this.b());
   }

   public dzz b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dzz $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dzz $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
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

   public void a(div $$0, iu $$1, dzz $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(div $$0) {
      return azm.a($$0.A, 2, 5);
   }

   protected static float a(dma $$0, dib $$1, iu $$2) {
      float $$3 = 1.0F;
      iu $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dzz $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dmc.cL)) {
               $$7 = 1.0F;
               if ($$8.c(doy.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iu $$9 = $$2.f();
      iu $$10 = $$2.g();
      iu $$11 = $$2.h();
      iu $$12 = $$2.i();
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
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(diy $$0, iu $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$1 instanceof arq $$4 && $$3 instanceof coe && $$4.O().c(dir.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected diu d() {
      return czc.qg;
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(this.d());
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      this.a((div)$$0, $$2, $$3);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(f);
   }
}
