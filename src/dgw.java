import com.mojang.serialization.MapCodec;

public class dgw extends dfk implements dfe {
   public static final MapCodec<dgw> d = b(dgw::new);
   public static final int e = 7;
   public static final dte f = dsu.av;
   private static final ewm[] a = new ewm[]{
      dfb.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dgw> a() {
      return d;
   }

   protected dgw(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(dfd.cC);
   }

   protected dte b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dse $$0) {
      return $$0.c(this.b());
   }

   public dse b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dse $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dse $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
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

   public void a(dca $$0, iz $$1, dse $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dca $$0) {
      return ayz.a($$0.z, 2, 5);
   }

   protected static float a(dfb $$0, dbg $$1, iz $$2) {
      float $$3 = 1.0F;
      iz $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dse $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfd.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dhy.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iz $$9 = $$2.e();
      iz $$10 = $$2.f();
      iz $$11 = $$2.g();
      iz $$12 = $$2.h();
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
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcd $$0, iz $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if ($$3 instanceof ckk && $$1.ab().b(dbw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dbz d() {
      return cuu.pv;
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(this.d());
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      this.a((dca)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(f);
   }
}
