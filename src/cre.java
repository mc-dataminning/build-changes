public class cre extends cpv implements cpp {
   public static final int c = 7;
   public static final ddb d = dcr.av;
   private static final efb[] a = new efb[]{
      cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cre(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(cpo.cC);
   }

   protected ddb a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dcb $$0) {
      return $$0.c(this.a());
   }

   public dcb b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dcb $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dcb $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
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

   public void a(cmm $$0, gu $$1, dcb $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cmm $$0) {
      return apa.a($$0.z, 2, 5);
   }

   protected static float a(cpn $$0, cls $$1, gu $$2) {
      float $$3 = 1.0F;
      gu $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dcb $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cpo.cC)) {
               $$7 = 1.0F;
               if ($$8.c(csg.a) > 0) {
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
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return ($$1.b($$2, 0) >= 8 || $$1.g($$2)) && super.a($$0, $$1, $$2);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if ($$3 instanceof bwh && $$1.X().b(cmi.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cml c() {
      return cgc.oH;
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(this.c());
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      this.a((cmm)$$0, $$2, $$3);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }
}
