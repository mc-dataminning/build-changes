import com.mojang.serialization.MapCodec;

public class dgt extends dfh implements dfb {
   public static final MapCodec<dgt> d = b(dgt::new);
   public static final int e = 7;
   public static final dtb f = dsr.av;
   private static final ewj[] a = new ewj[]{
      dey.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dgt> a() {
      return d;
   }

   protected dgt(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(dfa.cC);
   }

   protected dtb b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dsb $$0) {
      return $$0.c(this.b());
   }

   public dsb b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dsb $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dsb $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
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

   public void a(dbx $$0, iz $$1, dsb $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dbx $$0) {
      return ayy.a($$0.z, 2, 5);
   }

   protected static float a(dey $$0, dbd $$1, iz $$2) {
      float $$3 = 1.0F;
      iz $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dsb $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfa.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dhv.b) > 0) {
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
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dca $$0, iz $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if ($$3 instanceof ckh && $$1.ab().b(dbt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dbw d() {
      return cur.pv;
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(this.d());
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.a((dbx)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f);
   }
}
