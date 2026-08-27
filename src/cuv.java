import com.mojang.serialization.MapCodec;

public class cuv extends ctl implements ctf {
   public static final MapCodec<cuv> d = b(cuv::new);
   public static final int e = 7;
   public static final dgd f = dft.av;
   private static final eia[] a = new eia[]{
      ctc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      ctc.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cuv> a() {
      return d;
   }

   protected cuv(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(cte.cC);
   }

   protected dgd b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dfd $$0) {
      return $$0.c(this.b());
   }

   public dfd b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dfd $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dfd $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
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

   public void a(cqb $$0, gw $$1, dfd $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cqb $$0) {
      return asb.a($$0.z, 2, 5);
   }

   protected static float a(ctc $$0, cph $$1, gw $$2) {
      float $$3 = 1.0F;
      gw $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dfd $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cte.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvx.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      gw $$9 = $$2.e();
      gw $$10 = $$2.f();
      gw $$11 = $$2.g();
      gw $$12 = $$2.h();
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
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cqe $$0, gw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if ($$3 instanceof bzt && $$1.X().b(cpx.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cqa d() {
      return cjo.oH;
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(this.d());
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.a((cqb)$$0, $$2, $$3);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f);
   }
}
