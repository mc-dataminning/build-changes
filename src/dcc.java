import com.mojang.serialization.MapCodec;

public abstract class dcc extends ddv {
   protected static final eqk c = daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dnq d = dnp.w;

   protected dcc(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcc> a();

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$2.a($$0, $$1, ih.b, dia.c);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.c((cxc)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cwz)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), erm.b);
            }
         }
      }
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if ($$0.a((cxc)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dkg $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ih $$7 : ih.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cwz $$0, ib $$1, dmz $$2) {
      if (!this.c((cxc)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            erm $$5 = erm.c;
            if (this.b((cwf)$$0, $$1, $$2)) {
               $$5 = erm.a;
            } else if ($$3) {
               $$5 = erm.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cxc $$0, ib $$1, dmz $$2) {
      return false;
   }

   protected boolean a(cwz $$0, ib $$1, dmz $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cwz $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dmz $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dac.cw) ? $$6.c(dgb.f) : 0);
      }
   }

   protected int a(cxp $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(aE);
      ih $$4 = $$3.h();
      ih $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cwz $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(aE);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cwf $$0, ib $$1, dmz $$2) {
      return 15;
   }

   public static boolean m(dmz $$0) {
      return $$0.b() instanceof dcc;
   }

   public boolean b(cwf $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(aE).g();
      dmz $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dmz var1);
}
