import com.mojang.serialization.MapCodec;

public class cwv extends cvj implements cvd {
   public static final MapCodec<cwv> d = b(cwv::new);
   public static final int e = 7;
   public static final dii f = dhy.av;
   private static final ekn[] a = new ekn[]{
      cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cva.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cwv> a() {
      return d;
   }

   protected cwv(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.a(cvc.cC);
   }

   protected dii b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dhi $$0) {
      return $$0.c(this.b());
   }

   public dhi b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dhi $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dhi $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(csa $$0, ht $$1, dhi $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(csa $$0) {
      return atm.a($$0.z, 2, 5);
   }

   protected static float a(cva $$0, crg $$1, ht $$2) {
      float $$3 = 1.0F;
      ht $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dhi $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cvc.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cxx.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ht $$9 = $$2.e();
      ht $$10 = $$2.f();
      ht $$11 = $$2.g();
      ht $$12 = $$2.h();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.e()).a($$0) || $$1.a_($$12.e()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$11.f()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(csd $$0, ht $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if ($$3 instanceof cbn && $$1.Y().b(crw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected crz d() {
      return clm.ps;
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(this.d());
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      this.a((csa)$$0, $$2, $$3);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f);
   }
}
