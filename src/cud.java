public class cud extends csu implements cso {
   public static final int c = 7;
   public static final dga d = dfq.av;
   private static final ehx[] a = new ehx[]{
      csm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cud(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(csn.cC);
   }

   protected dga a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dfa $$0) {
      return $$0.c(this.a());
   }

   public dfa b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dfa $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dfa $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
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

   public void a(cpm $$0, gu $$1, dfa $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpm $$0) {
      return arp.a($$0.z, 2, 5);
   }

   protected static float a(csm $$0, cos $$1, gu $$2) {
      float $$3 = 1.0F;
      gu $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dfa $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csn.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvf.a) > 0) {
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
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cpp $$0, gu $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$3 instanceof bzg && $$1.X().b(cpi.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpl c() {
      return cjb.oH;
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(this.c());
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      this.a((cpm)$$0, $$2, $$3);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d);
   }
}
