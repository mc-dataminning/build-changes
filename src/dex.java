import com.mojang.serialization.MapCodec;

public abstract class dex extends dgr {
   protected static final ety c = dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dqp d = dqo.w;

   protected dex(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dex> a();

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(czx $$0, im $$1, dpy $$2) {
      return $$2.a($$0, $$1, ir.b, dkw.c);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!this.c((czx)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((czu)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eva.b);
            }
         }
      }
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$0.a((czx)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dnd $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ir $$7 : ir.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(czu $$0, im $$1, dpy $$2) {
      if (!this.c((czx)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            eva $$5 = eva.c;
            if (this.b((cza)$$0, $$1, $$2)) {
               $$5 = eva.a;
            } else if ($$3) {
               $$5 = eva.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(czx $$0, im $$1, dpy $$2) {
      return false;
   }

   protected boolean a(czu $$0, im $$1, dpy $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(czu $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(aE);
      im $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dpy $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dcx.cw) ? $$6.c(dix.f) : 0);
      }
   }

   protected int a(dak $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(aE);
      ir $$4 = $$3.h();
      ir $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(czu $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(aE);
      im $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cza $$0, im $$1, dpy $$2) {
      return 15;
   }

   public static boolean m(dpy $$0) {
      return $$0.b() instanceof dex;
   }

   public boolean b(cza $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(aE).g();
      dpy $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dpy var1);
}
