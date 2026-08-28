import com.mojang.serialization.MapCodec;

public class doo extends dwd implements dmu {
   public static final MapCodec<doo> d = b(doo::new);
   public static final int e = 7;
   public static final ebt f = ebj.ay;
   private static final ffw[] a = dmr.a(7, $$0 -> dmr.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends doo> a() {
      return d;
   }

   protected doo(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(dmt.cN);
   }

   protected ebt b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(eat $$0) {
      return $$0.c(this.b());
   }

   public eat b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(eat $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(eat $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
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

   public void b(djm $$0, iv $$1, eat $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(djm $$0) {
      return azm.a($$0.A, 2, 5);
   }

   protected static float a(dmr $$0, diq $$1, iv $$2) {
      float $$3 = 1.0F;
      iv $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            eat $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dmt.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dpq.b) > 0) {
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
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(djp $$0, iv $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$1 instanceof arq $$5 && $$3 instanceof cot && $$5.O().c(dji.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected djl d() {
      return czr.qj;
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(this.d());
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(f);
   }
}
