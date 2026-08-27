public class cum extends ctd implements csx {
   public static final int c = 7;
   public static final dgj d = dfz.av;
   private static final eig[] a = new eig[]{
      csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cum(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return $$0.a(csw.cC);
   }

   protected dgj a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dfj $$0) {
      return $$0.c(this.a());
   }

   public dfj b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dfj $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dfj $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
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

   public void a(cpv $$0, gw $$1, dfj $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpv $$0) {
      return arw.a($$0.z, 2, 5);
   }

   protected static float a(csv $$0, cpb $$1, gw $$2) {
      float $$3 = 1.0F;
      gw $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dfj $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csw.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvo.a) > 0) {
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
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cpy $$0, gw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$3 instanceof bzn && $$1.X().b(cpr.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpu c() {
      return cji.oH;
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return new cjf(this.c());
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      this.a((cpv)$$0, $$2, $$3);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d);
   }
}
