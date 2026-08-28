import com.mojang.serialization.MapCodec;

public class dmi extends dkv implements dko {
   public static final MapCodec<dmi> d = b(dmi::new);
   public static final int e = 7;
   public static final dyt f = dyk.aw;
   private static final fcr[] a = new fcr[]{
      dkl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dkl.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dmi> a() {
      return d;
   }

   protected dmi(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a(dkn.cK);
   }

   protected dyt b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dxu $$0) {
      return $$0.c(this.b());
   }

   public dxu b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dxu $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dxu $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
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

   public void a(dhh $$0, jh $$1, dxu $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dhh $$0) {
      return bae.a($$0.A, 2, 5);
   }

   protected static float a(dkl $$0, dgm $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dxu $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dkn.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dnj.b) > 0) {
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
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhk $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cnb && $$4.N().b(dhd.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dhg d() {
      return cxs.pR;
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(this.d());
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      this.a((dhh)$$0, $$2, $$3);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f);
   }
}
