import com.mojang.serialization.MapCodec;

public class dpl extends dxa implements dnr {
   public static final MapCodec<dpl> d = b(dpl::new);
   public static final int e = 7;
   public static final ecq f = ecg.ay;
   private static final fgw[] a = dno.a(7, $$0 -> dno.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dpl> a() {
      return d;
   }

   protected dpl(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.cN);
   }

   protected ecq b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(ebq $$0) {
      return $$0.c(this.b());
   }

   public ebq b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(ebq $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(ebq $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
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

   public void b(dkj $$0, iw $$1, ebq $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dkj $$0) {
      return azz.a($$0.A, 2, 5);
   }

   protected static float a(dno $$0, djn $$1, iw $$2) {
      float $$3 = 1.0F;
      iw $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            ebq $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dnq.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dqn.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iw $$9 = $$2.f();
      iw $$10 = $$2.g();
      iw $$11 = $$2.h();
      iw $$12 = $$2.i();
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
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dkm $$0, iw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$1 instanceof asb $$5 && $$3 instanceof cpp && $$5.O().c(dkf.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected dki d() {
      return dao.qj;
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(this.d());
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f);
   }
}
