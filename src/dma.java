import com.mojang.serialization.MapCodec;

public class dma extends dko implements dkh {
   public static final MapCodec<dma> d = b(dma::new);
   public static final int e = 7;
   public static final dyq f = dyg.ay;
   private static final fcr[] a = dke.a(7, $$0 -> dke.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dma> a() {
      return d;
   }

   protected dma(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(dkg.cK);
   }

   protected dyq b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dxq $$0) {
      return $$0.c(this.b());
   }

   public dxq b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dxq $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dxq $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
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

   public void a(dgz $$0, ji $$1, dxq $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dgz $$0) {
      return ayz.a($$0.A, 2, 5);
   }

   protected static float a(dke $$0, dgf $$1, ji $$2) {
      float $$3 = 1.0F;
      ji $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dxq $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dkg.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dnc.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ji $$9 = $$2.f();
      ji $$10 = $$2.g();
      ji $$11 = $$2.h();
      ji $$12 = $$2.i();
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
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhc $$0, ji $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cmx && $$4.O().b(dgv.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgy d() {
      return cxl.qc;
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(this.d());
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.a((dgz)$$0, $$2, $$3);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(f);
   }
}
