import com.mojang.serialization.MapCodec;

public class dhc extends dfq implements dfk {
   public static final MapCodec<dhc> d = b(dhc::new);
   public static final int e = 7;
   public static final dtk f = dta.av;
   private static final ewy[] a = new ewy[]{
      dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dhc> a() {
      return d;
   }

   protected dhc(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(dfj.cC);
   }

   protected dtk b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dsk $$0) {
      return $$0.c(this.b());
   }

   public dsk b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dsk $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dsk $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
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

   public void a(dcf $$0, ja $$1, dsk $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dcf $$0) {
      return ayg.a($$0.z, 2, 5);
   }

   protected static float a(dfh $$0, dbl $$1, ja $$2) {
      float $$3 = 1.0F;
      ja $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dsk $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfj.cC)) {
               $$7 = 1.0F;
               if ($$8.c(die.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ja $$9 = $$2.e();
      ja $$10 = $$2.f();
      ja $$11 = $$2.g();
      ja $$12 = $$2.h();
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
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dci $$0, ja $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$3 instanceof cjv && $$1.ab().b(dcb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dce d() {
      return cuf.pv;
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(this.d());
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      this.a((dcf)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(f);
   }
}
