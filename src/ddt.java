import com.mojang.serialization.MapCodec;

public class ddt extends dch implements dcb {
   public static final MapCodec<ddt> d = b(ddt::new);
   public static final int e = 7;
   public static final dpz f = dpp.av;
   private static final est[] a = new est[]{
      dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends ddt> a() {
      return d;
   }

   protected ddt(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(dca.cC);
   }

   protected dpz b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(doz $$0) {
      return $$0.c(this.b());
   }

   public doz b(int $$0) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(doz $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean e_(doz $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
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

   public void a(cyx $$0, ib $$1, doz $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cyx $$0) {
      return axk.a($$0.z, 2, 5);
   }

   protected static float a(dby $$0, cyd $$1, ib $$2) {
      float $$3 = 1.0F;
      ib $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            doz $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dca.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dev.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ib $$9 = $$2.e();
      ib $$10 = $$2.f();
      ib $$11 = $$2.g();
      ib $$12 = $$2.h();
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
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cza $$0, ib $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if ($$3 instanceof che && $$1.aa().b(cyt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cyw d() {
      return crm.pu;
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(this.d());
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.a((cyx)$$0, $$2, $$3);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(f);
   }
}
