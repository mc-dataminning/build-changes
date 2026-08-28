import com.mojang.serialization.MapCodec;

public class dlj extends djx implements djq {
   public static final MapCodec<dlj> d = b(dlj::new);
   public static final int e = 7;
   public static final dxx f = dxo.ay;
   private static final fbv[] a = new fbv[]{
      djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dlj> a() {
      return d;
   }

   protected dlj(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.cK);
   }

   protected dxx b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dwy $$0) {
      return $$0.c(this.b());
   }

   public dwy b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dwy $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dwy $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
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

   public void a(dgj $$0, ji $$1, dwy $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dgj $$0) {
      return ayz.a($$0.A, 2, 5);
   }

   protected static float a(djn $$0, dfo $$1, ji $$2) {
      float $$3 = 1.0F;
      ji $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dwy $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(djp.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dml.b) > 0) {
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
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dgm $$0, ji $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cme && $$4.O().b(dgf.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgi d() {
      return cwu.qa;
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(this.d());
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      this.a((dgj)$$0, $$2, $$3);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f);
   }
}
