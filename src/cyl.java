import com.mojang.serialization.MapCodec;

public class cyl extends cwz implements cwt {
   public static final MapCodec<cyl> d = b(cyl::new);
   public static final int e = 7;
   public static final dkh f = djx.av;
   private static final emm[] a = new emm[]{
      cwq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cyl> a() {
      return d;
   }

   protected cyl(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(cws.cC);
   }

   protected dkh b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(djh $$0) {
      return $$0.c(this.b());
   }

   public djh b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(djh $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(djh $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
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

   public void a(ctp $$0, hx $$1, djh $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(ctp $$0) {
      return auo.a($$0.z, 2, 5);
   }

   protected static float a(cwq $$0, csv $$1, hx $$2) {
      float $$3 = 1.0F;
      hx $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            djh $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cws.cC)) {
               $$7 = 1.0F;
               if ($$8.c(czn.b) > 0) {
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
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cts $$0, hx $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if ($$3 instanceof ccu && $$1.Z().b(ctl.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cto d() {
      return cnb.ps;
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(this.d());
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.a((ctp)$$0, $$2, $$3);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f);
   }
}
