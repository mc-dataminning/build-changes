import com.mojang.serialization.MapCodec;

public class dez extends ddn implements ddh {
   public static final MapCodec<dez> d = b(dez::new);
   public static final int e = 7;
   public static final drh f = dqx.av;
   private static final eui[] a = new eui[]{
      dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dez> a() {
      return d;
   }

   protected dez(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.cC);
   }

   protected drh b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dqh $$0) {
      return $$0.c(this.b());
   }

   public dqh b(int $$0) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dqh $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dqh $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
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

   public void a(dad $$0, in $$1, dqh $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dad $$0) {
      return axz.a($$0.z, 2, 5);
   }

   protected static float a(dde $$0, czj $$1, in $$2) {
      float $$3 = 1.0F;
      in $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dqh $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(ddg.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dgb.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      in $$9 = $$2.e();
      in $$10 = $$2.f();
      in $$11 = $$2.g();
      in $$12 = $$2.h();
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
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dag $$0, in $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$3 instanceof cis && $$1.aa().b(czz.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dac d() {
      return ctc.pv;
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(this.d());
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.a((dad)$$0, $$2, $$3);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f);
   }
}
