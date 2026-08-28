import com.mojang.serialization.MapCodec;

public class dhd extends dfr implements dfl {
   public static final MapCodec<dhd> d = b(dhd::new);
   public static final int e = 7;
   public static final dtl f = dtb.av;
   private static final exa[] a = new exa[]{
      dfi.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dhd> a() {
      return d;
   }

   protected dhd(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.cC);
   }

   protected dtl b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dsl $$0) {
      return $$0.c(this.b());
   }

   public dsl b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dsl $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dsl $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
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

   public void a(dcg $$0, ja $$1, dsl $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dcg $$0) {
      return ayg.a($$0.z, 2, 5);
   }

   protected static float a(dfi $$0, dbm $$1, ja $$2) {
      float $$3 = 1.0F;
      ja $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dsl $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfk.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dif.b) > 0) {
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
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcj $$0, ja $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if ($$3 instanceof cjw && $$1.ab().b(dcc.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dcf d() {
      return cug.pv;
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return new cud(this.d());
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      this.a((dcg)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(f);
   }
}
