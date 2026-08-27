import com.mojang.serialization.MapCodec;

public abstract class dbh extends dda {
   protected static final epo c = czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dmv d = dmu.w;

   protected dbh(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbh> a();

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$2.a($$0, $$1, ih.b, dhf.c);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!this.c((cwh)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cwe)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eqq.b);
            }
         }
      }
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$0.a((cwh)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         djl $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ih $$7 : ih.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cwe $$0, ib $$1, dme $$2) {
      if (!this.c((cwh)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            eqq $$5 = eqq.c;
            if (this.b((cvk)$$0, $$1, $$2)) {
               $$5 = eqq.a;
            } else if ($$3) {
               $$5 = eqq.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cwh $$0, ib $$1, dme $$2) {
      return false;
   }

   protected boolean a(cwe $$0, ib $$1, dme $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dme $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(czh.cw) ? $$6.c(dfg.f) : 0);
      }
   }

   protected int a(cwu $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(aE);
      ih $$4 = $$3.h();
      ih $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cvk $$0, ib $$1, dme $$2) {
      return 15;
   }

   public static boolean m(dme $$0) {
      return $$0.b() instanceof dbh;
   }

   public boolean b(cvk $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(aE).g();
      dme $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dme var1);
}
