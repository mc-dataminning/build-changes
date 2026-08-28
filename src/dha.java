import com.mojang.serialization.MapCodec;

public class dha extends dfo implements dfi {
   public static final MapCodec<dha> d = b(dha::new);
   public static final int e = 7;
   public static final dth f = dsx.av;
   private static final ews[] a = new ews[]{
      dff.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dha> a() {
      return d;
   }

   protected dha(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(dfh.cC);
   }

   protected dth b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dsh $$0) {
      return $$0.c(this.b());
   }

   public dsh b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dsh $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dsh $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
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

   public void a(dcd $$0, ja $$1, dsh $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dcd $$0) {
      return aye.a($$0.z, 2, 5);
   }

   protected static float a(dff $$0, dbj $$1, ja $$2) {
      float $$3 = 1.0F;
      ja $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dsh $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfh.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dic.b) > 0) {
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
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcg $$0, ja $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      if ($$3 instanceof cjs && $$1.ab().b(dbz.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dcc d() {
      return cud.pv;
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(this.d());
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.a((dcd)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f);
   }
}
