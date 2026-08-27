import com.mojang.serialization.MapCodec;

public abstract class cxh extends cza {
   protected static final eks c = cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final die d = did.w;

   protected cxh(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxh> a();

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(csi $$0, hx $$1, dhn $$2) {
      return $$2.a($$0, $$1, ib.b, ddf.c);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!this.c((csi)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((csf)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), elp.b);
            }
         }
      }
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if ($$0.a((csi)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dfi $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ib $$7 : ib.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(csf $$0, hx $$1, dhn $$2) {
      if (!this.c((csi)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.M().b($$1, this)) {
            elp $$5 = elp.c;
            if (this.b((crl)$$0, $$1, $$2)) {
               $$5 = elp.a;
            } else if ($$3) {
               $$5 = elp.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(csi $$0, hx $$1, dhn $$2) {
      return false;
   }

   protected boolean a(csf $$0, hx $$1, dhn $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dhn $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cvh.cw) ? $$6.c(dbg.f) : 0);
      }
   }

   protected int a(csv $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(aE);
      ib $$4 = $$3.h();
      ib $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(aE);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(crl $$0, hx $$1, dhn $$2) {
      return 15;
   }

   public static boolean h(dhn $$0) {
      return $$0.b() instanceof cxh;
   }

   public boolean b(crl $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(aE).g();
      dhn $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dhn var1);
}
