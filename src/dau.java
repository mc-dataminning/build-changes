import com.mojang.serialization.MapCodec;

public abstract class dau extends dcn {
   protected static final eos c = cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dma d = dlz.w;

   protected dau(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dau> a();

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(cvu $$0, hz $$1, dlj $$2) {
      return $$2.a($$0, $$1, ie.b, dgs.c);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!this.c((cvu)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((cvr)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), epu.b);
            }
         }
      }
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if ($$0.a((cvu)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dix $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (ie $$7 : ie.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(cvr $$0, hz $$1, dlj $$2) {
      if (!this.c((cvu)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.N().b($$1, this)) {
            epu $$5 = epu.c;
            if (this.b((cux)$$0, $$1, $$2)) {
               $$5 = epu.a;
            } else if ($$3) {
               $$5 = epu.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(cvu $$0, hz $$1, dlj $$2) {
      return false;
   }

   protected boolean a(cvr $$0, hz $$1, dlj $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(aE);
      hz $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dlj $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(cyu.cw) ? $$6.c(det.f) : 0);
      }
   }

   protected int a(cwh $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(aE);
      ie $$4 = $$3.h();
      ie $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(aE);
      hz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(cux $$0, hz $$1, dlj $$2) {
      return 15;
   }

   public static boolean m(dlj $$0) {
      return $$0.b() instanceof dau;
   }

   public boolean b(cux $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(aE).g();
      dlj $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dlj var1);
}
