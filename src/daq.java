import com.mojang.serialization.MapCodec;

public abstract class daq extends dcj {
   protected static final eol c = cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dlw d = dlv.w;

   protected daq(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends daq> a();

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      hz $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cvq $$0, hz $$1, dlf $$2) {
      return $$2.a($$0, $$1, ie.b, dgo.c);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!this.c((cvq)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cvn)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), epn.b);
            }
         }
      }
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$0.a((cvq)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dit $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ie $$7 : ie.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cvn $$0, hz $$1, dlf $$2) {
      if (!this.c((cvq)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            epn $$5 = epn.c;
            if (this.b((cut)$$0, $$1, $$2)) {
               $$5 = epn.a;
            } else if ($$3) {
               $$5 = epn.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cvq $$0, hz $$1, dlf $$2) {
      return false;
   }

   protected boolean a(cvn $$0, hz $$1, dlf $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cvn $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(aE);
      hz $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dlf $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cyq.cw) ? $$6.c(dep.f) : 0);
      }
   }

   protected int a(cwd $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(aE);
      ie $$4 = $$3.h();
      ie $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cvn $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(aE);
      hz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cut $$0, hz $$1, dlf $$2) {
      return 15;
   }

   public static boolean m(dlf $$0) {
      return $$0.b() instanceof daq;
   }

   public boolean b(cut $$0, hz $$1, dlf $$2) {
      ie $$3 = $$2.c(aE).g();
      dlf $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dlf var1);
}
