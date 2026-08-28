import com.mojang.serialization.MapCodec;

public class dgu extends dfi implements dfc {
   public static final MapCodec<dgu> d = b(dgu::new);
   public static final int e = 7;
   public static final dtc f = dss.av;
   private static final ewk[] a = new ewk[]{
      dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dgu> a() {
      return d;
   }

   protected dgu(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(dfb.cC);
   }

   protected dtc b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dsc $$0) {
      return $$0.c(this.b());
   }

   public dsc b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dsc $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dsc $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
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

   public void a(dby $$0, iz $$1, dsc $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dby $$0) {
      return ayz.a($$0.z, 2, 5);
   }

   protected static float a(dez $$0, dbe $$1, iz $$2) {
      float $$3 = 1.0F;
      iz $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dsc $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfb.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dhw.b) > 0) {
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
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcb $$0, iz $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if ($$3 instanceof cki && $$1.ab().b(dbu.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dbx d() {
      return cus.pv;
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(this.d());
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      this.a((dby)$$0, $$2, $$3);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(f);
   }
}
