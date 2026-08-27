public class cuc extends cst implements csn {
   public static final int c = 7;
   public static final dfz d = dfp.av;
   private static final ehw[] a = new ehw[]{
      csl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cuc(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(csm.cC);
   }

   protected dfz a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dez $$0) {
      return $$0.c(this.a());
   }

   public dez b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dez $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dez $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
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

   public void a(cpl $$0, gu $$1, dez $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpl $$0) {
      return arp.a($$0.z, 2, 5);
   }

   protected static float a(csl $$0, cor $$1, gu $$2) {
      float $$3 = 1.0F;
      gu $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dez $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csm.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cve.a) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      gu $$9 = $$2.e();
      gu $$10 = $$2.f();
      gu $$11 = $$2.g();
      gu $$12 = $$2.h();
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
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cpo $$0, gu $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if ($$3 instanceof bzf && $$1.X().b(cph.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpk c() {
      return cja.oH;
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(this.c());
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      this.a((cpl)$$0, $$2, $$3);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d);
   }
}
