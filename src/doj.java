import com.mojang.serialization.MapCodec;

public class doj extends dvy implements dmp {
   public static final MapCodec<doj> d = b(doj::new);
   public static final int e = 7;
   public static final ebo f = ebe.ay;
   private static final ffr[] a = dmm.a(7, $$0 -> dmm.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends doj> a() {
      return d;
   }

   protected doj(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(eao $$0, din $$1, iv $$2) {
      return $$0.a(dmo.cN);
   }

   protected ebo b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(eao $$0) {
      return $$0.c(this.b());
   }

   public eao b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(eao $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(eao $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
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

   public void b(djh $$0, iv $$1, eao $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(djh $$0) {
      return azm.a($$0.A, 2, 5);
   }

   protected static float a(dmm $$0, din $$1, iv $$2) {
      float $$3 = 1.0F;
      iv $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            eao $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dmo.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dpl.b) > 0) {
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
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(djk $$0, iv $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3 instanceof coq && $$5.O().c(djd.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected djg d() {
      return czo.qj;
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return new czk(this.d());
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(f);
   }
}
