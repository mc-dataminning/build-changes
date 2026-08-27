public class cuh extends csy implements css {
   public static final int c = 7;
   public static final dge d = dfu.av;
   private static final eib[] a = new eib[]{
      csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cuh(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(csr.cC);
   }

   protected dge a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dfe $$0) {
      return $$0.c(this.a());
   }

   public dfe b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dfe $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dfe $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
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

   public void a(cpq $$0, gw $$1, dfe $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpq $$0) {
      return ars.a($$0.z, 2, 5);
   }

   protected static float a(csq $$0, cow $$1, gw $$2) {
      float $$3 = 1.0F;
      gw $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dfe $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csr.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvj.a) > 0) {
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
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cpt $$0, gw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$3 instanceof bzi && $$1.X().b(cpm.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpp c() {
      return cjd.oH;
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(this.c());
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.a((cpq)$$0, $$2, $$3);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d);
   }
}
