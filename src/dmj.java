import com.mojang.serialization.MapCodec;

public class dmj extends dkw implements dkp {
   public static final MapCodec<dmj> d = b(dmj::new);
   public static final int e = 7;
   public static final dyu f = dyl.aw;
   private static final fcs[] a = new fcs[]{
      dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dkm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dmj> a() {
      return d;
   }

   protected dmj(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a(dko.cK);
   }

   protected dyu b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dxv $$0) {
      return $$0.c(this.b());
   }

   public dxv b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dxv $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dxv $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dxv $$0, ash $$1, jh $$2, bam $$3) {
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

   public void a(dhi $$0, jh $$1, dxv $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dhi $$0) {
      return bae.a($$0.A, 2, 5);
   }

   protected static float a(dkm $$0, dgn $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dxv $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dko.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dnk.b) > 0) {
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
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhl $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cnc && $$4.N().b(dhe.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dhh d() {
      return cxt.pR;
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(this.d());
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      this.a((dhi)$$0, $$2, $$3);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f);
   }
}
