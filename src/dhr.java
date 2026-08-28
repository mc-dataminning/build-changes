import com.mojang.serialization.MapCodec;

public class dhr extends dgf implements dfz {
   public static final MapCodec<dhr> d = b(dhr::new);
   public static final int e = 7;
   public static final dua f = dtq.av;
   private static final exp[] a = new exp[]{
      dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dhr> a() {
      return d;
   }

   protected dhr(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(dfy.cC);
   }

   protected dua b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dta $$0) {
      return $$0.c(this.b());
   }

   public dta b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dta $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dta $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
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

   public void a(dcu $$0, jd $$1, dta $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dcu $$0) {
      return ayn.a($$0.z, 2, 5);
   }

   protected static float a(dfw $$0, dca $$1, jd $$2) {
      float $$3 = 1.0F;
      jd $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dta $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dfy.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dit.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jd $$9 = $$2.e();
      jd $$10 = $$2.f();
      jd $$11 = $$2.g();
      jd $$12 = $$2.h();
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
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcx $$0, jd $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3 instanceof ckg && $$1.ab().b(dcq.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dct d() {
      return cur.pv;
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(this.d());
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      this.a((dcu)$$0, $$2, $$3);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f);
   }
}
