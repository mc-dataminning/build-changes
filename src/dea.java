import com.mojang.serialization.MapCodec;

public abstract class dea extends dft {
   protected static final est c = dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dpq d = dpp.w;

   protected dea(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dea> a();

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cza $$0, ib $$1, doz $$2) {
      return $$2.a($$0, $$1, ih.b, djy.c);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!this.c((cza)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cyx)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), etv.b);
            }
         }
      }
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if ($$0.a((cza)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dmf $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ih $$7 : ih.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cyx $$0, ib $$1, doz $$2) {
      if (!this.c((cza)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            etv $$5 = etv.c;
            if (this.b((cyd)$$0, $$1, $$2)) {
               $$5 = etv.a;
            } else if ($$3) {
               $$5 = etv.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cza $$0, ib $$1, doz $$2) {
      return false;
   }

   protected boolean a(cyx $$0, ib $$1, doz $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cyx $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         doz $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dca.cw) ? $$6.c(dhz.f) : 0);
      }
   }

   protected int a(czn $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(aE);
      ih $$4 = $$3.h();
      ih $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cyx $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cyd $$0, ib $$1, doz $$2) {
      return 15;
   }

   public static boolean m(doz $$0) {
      return $$0.b() instanceof dea;
   }

   public boolean b(cyd $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(aE).g();
      doz $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(doz var1);
}
