import com.mojang.serialization.MapCodec;

public class cyt extends cxh implements cxb {
   public static final MapCodec<cyt> d = b(cyt::new);
   public static final int e = 7;
   public static final dkp f = dkf.av;
   private static final emv[] a = new emv[]{
      cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cyt> a() {
      return d;
   }

   protected cyt(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.a(cxa.cC);
   }

   protected dkp b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(djp $$0) {
      return $$0.c(this.b());
   }

   public djp b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(djp $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(djp $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
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

   public void a(ctx $$0, hx $$1, djp $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(ctx $$0) {
      return aup.a($$0.z, 2, 5);
   }

   protected static float a(cwy $$0, ctd $$1, hx $$2) {
      float $$3 = 1.0F;
      hx $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            djp $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cxa.cC)) {
               $$7 = 1.0F;
               if ($$8.c(czv.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hx $$9 = $$2.e();
      hx $$10 = $$2.f();
      hx $$11 = $$2.g();
      hx $$12 = $$2.h();
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
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cua $$0, hx $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if ($$3 instanceof cdb && $$1.Z().b(ctt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected ctw d() {
      return cnj.pu;
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(this.d());
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.a((ctx)$$0, $$2, $$3);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f);
   }
}
