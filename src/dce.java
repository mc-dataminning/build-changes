import com.mojang.serialization.MapCodec;

public abstract class dce extends ddx {
   protected static final eqm c = dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dns d = dnr.w;

   protected dce(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dce> a();

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$2.a($$0, $$1, ih.b, dic.c);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.c((cxe)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cxb)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), ero.b);
            }
         }
      }
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if ($$0.a((cxe)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dki $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ih $$7 : ih.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cxb $$0, ib $$1, dnb $$2) {
      if (!this.c((cxe)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            ero $$5 = ero.c;
            if (this.b((cwh)$$0, $$1, $$2)) {
               $$5 = ero.a;
            } else if ($$3) {
               $$5 = ero.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cxe $$0, ib $$1, dnb $$2) {
      return false;
   }

   protected boolean a(cxb $$0, ib $$1, dnb $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cxb $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dnb $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dae.cw) ? $$6.c(dgd.f) : 0);
      }
   }

   protected int a(cxr $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(aE);
      ih $$4 = $$3.h();
      ih $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cxb $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cwh $$0, ib $$1, dnb $$2) {
      return 15;
   }

   public static boolean m(dnb $$0) {
      return $$0.b() instanceof dce;
   }

   public boolean b(cwh $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(aE).g();
      dnb $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dnb var1);
}
