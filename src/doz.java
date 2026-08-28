import com.mojang.serialization.MapCodec;

public class doz extends dwo implements dnf {
   public static final MapCodec<doz> d = b(doz::new);
   public static final int e = 7;
   public static final ece f = ebu.ay;
   private static final fgk[] a = dnc.a(7, $$0 -> dnc.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends doz> a() {
      return d;
   }

   protected doz(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(dne.cN);
   }

   protected ece b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(ebe $$0) {
      return $$0.c(this.b());
   }

   public ebe b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(ebe $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(ebe $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
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

   public void b(djx $$0, iv $$1, ebe $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(djx $$0) {
      return azo.a($$0.A, 2, 5);
   }

   protected static float a(dnc $$0, djb $$1, iv $$2) {
      float $$3 = 1.0F;
      iv $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            ebe $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dne.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dqb.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iv $$9 = $$2.f();
      iv $$10 = $$2.g();
      iv $$11 = $$2.h();
      iv $$12 = $$2.i();
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
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dka $$0, iv $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$1 instanceof ars $$5 && $$3 instanceof cpe && $$5.O().c(djt.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected djw d() {
      return dac.qj;
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(this.d());
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f);
   }
}
