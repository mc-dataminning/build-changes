import com.mojang.serialization.MapCodec;

public abstract class cxc extends cyv {
   protected static final ekn c = cva.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dhz d = dhy.w;

   protected cxc(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cxc> a();

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$2.a($$0, $$1, hx.b, dda.c);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!this.c((csd)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((csa)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), elk.b);
            }
         }
      }
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if ($$0.a((csd)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dfd $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (hx $$7 : hx.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(csa $$0, ht $$1, dhi $$2) {
      if (!this.c((csd)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.M().b($$1, this)) {
            elk $$5 = elk.c;
            if (this.b((crg)$$0, $$1, $$2)) {
               $$5 = elk.a;
            } else if ($$3) {
               $$5 = elk.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(csd $$0, ht $$1, dhi $$2) {
      return false;
   }

   protected boolean a(csa $$0, ht $$1, dhi $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(csa $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(aE);
      ht $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dhi $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cvc.cw) ? $$6.c(dbb.f) : 0);
      }
   }

   protected int a(csq $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(aE);
      hx $$4 = $$3.h();
      hx $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(csa $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(aE);
      ht $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(crg $$0, ht $$1, dhi $$2) {
      return 15;
   }

   public static boolean h(dhi $$0) {
      return $$0.b() instanceof cxc;
   }

   public boolean b(crg $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(aE).g();
      dhi $$4 = $$0.a_($$1.a($$3));
      return h($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dhi var1);
}
