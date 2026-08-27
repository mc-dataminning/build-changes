public class cub extends css implements csm {
   public static final int c = 7;
   public static final dfy d = dfo.av;
   private static final ehy[] a = new ehy[]{
      csk.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cub(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(csl.cC);
   }

   protected dfy a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dey $$0) {
      return $$0.c(this.a());
   }

   public dey b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dey $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dey $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.b()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(cpk $$0, gv $$1, dey $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpk $$0) {
      return aro.a($$0.z, 2, 5);
   }

   protected static float a(csk $$0, coq $$1, gv $$2) {
      float $$3 = 1.0F;
      gv $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dey $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csl.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvd.a) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      gv $$9 = $$2.e();
      gv $$10 = $$2.f();
      gv $$11 = $$2.g();
      gv $$12 = $$2.h();
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
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cpn $$0, gv $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$3 instanceof bze && $$1.X().b(cpg.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpj c() {
      return ciz.oH;
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(this.c());
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.a((cpk)$$0, $$2, $$3);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }
}
