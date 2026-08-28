import com.mojang.serialization.MapCodec;

public abstract class dhj extends djd {
   protected static final ewy c = dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dtb d = dta.w;

   protected dhj(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhj> a();

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$2.a($$0, $$1, jf.b, dni.c);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!this.c((dci)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dcf)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), eya.b);
            }
         }
      }
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if ($$0.a((dci)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dpp $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jf $$7 : jf.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dcf $$0, ja $$1, dsk $$2) {
      if (!this.c((dci)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.P().b($$1, this)) {
            eya $$5 = eya.c;
            if (this.b((dbl)$$0, $$1, $$2)) {
               $$5 = eya.a;
            } else if ($$3) {
               $$5 = eya.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dci $$0, ja $$1, dsk $$2) {
      return false;
   }

   protected boolean a(dcf $$0, ja $$1, dsk $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dcf $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dsk $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dfj.cw) ? $$6.c(dlj.f) : 0);
      }
   }

   protected int a(dcv $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(aE);
      jf $$4 = $$3.h();
      jf $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dcf $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(aE);
      ja $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dbl $$0, ja $$1, dsk $$2) {
      return 15;
   }

   public static boolean m(dsk $$0) {
      return $$0.b() instanceof dhj;
   }

   public boolean b(dbl $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(aE).g();
      dsk $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dsk var1);
}
