public class fpx extends frv {
   private final eeq b;
   protected boolean a;

   fpx(fns $$0, double $$1, double $$2, double $$3, eeq $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eeq g() {
      return this.b;
   }

   @Override
   public fqz b() {
      return fqz.b;
   }

   @Override
   public int a(float $$0) {
      return this.a ? 240 : super.a($$0);
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      this.h();
      if (!this.o) {
         this.k = this.k - (double)this.u;
         this.a(this.j, this.k, this.l);
         this.i();
         if (!this.o) {
            this.j *= 0.98F;
            this.k *= 0.98F;
            this.l *= 0.98F;
            if (this.b != ees.a) {
               hx $$0 = hx.a(this.g, this.h, this.i);
               eer $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((csv)this.c, $$0))) {
                  this.k();
               }
            }
         }
      }
   }

   protected void h() {
      if (this.t-- <= 0) {
         this.k();
      }
   }

   protected void i() {
   }

   public static frv a(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.b($$1, $$2, $$3, $$4, ees.c, jx.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frv b(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.e($$1, $$2, $$3, $$4, ees.c, jx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frv c(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fpx.a($$1, $$2, $$3, $$4, ees.e, jx.k);
   }

   public static frv d(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.e($$1, $$2, $$3, $$4, ees.e, jx.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frv e(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.c($$1, $$2, $$3, $$4, ees.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frv f(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx.b $$8 = new fpx.b($$1, $$2, $$3, $$4, ees.a, jx.at);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static frv g(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.g($$1, $$2, $$3, $$4, ees.a, jx.au);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static frv h(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.c($$1, $$2, $$3, $$4, ees.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static frv i(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.b($$1, $$2, $$3, $$4, ees.c, jx.aL);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frv j(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.d($$1, $$2, $$3, $$4, ees.c, jx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frv k(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fpx.a($$1, $$2, $$3, $$4, ees.e, jx.aJ);
   }

   public static frv l(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.d($$1, $$2, $$3, $$4, ees.e, jx.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frv m(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.f($$1, $$2, $$3, $$4, ees.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static frv n(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / auo.b($$1.F_(), 0.1F, 0.9F));
      fpx $$9 = new fpx.f($$1, $$2, $$3, $$4, ees.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static frv o(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx.b $$8 = new fpx.b($$1, $$2, $$3, $$4, ees.a, jx.aC);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static frv p(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.e($$1, $$2, $$3, $$4, ees.a, jx.aD);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static frv q(ka $$0, fns $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpx $$8 = new fpx.c($$1, $$2, $$3, $$4, ees.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fpx.b {
      a(fns $$0, double $$1, double $$2, double $$3, eeq $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void h() {
         this.v = 1.0F;
         this.w = 16.0F / (float)(40 - this.t + 16);
         this.x = 4.0F / (float)(40 - this.t + 8);
         super.h();
      }
   }

   static class b extends fpx {
      private final jv b;

      b(fns $$0, double $$1, double $$2, double $$3, eeq $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.b = $$5;
         this.u *= 0.02F;
         this.t = 40;
      }

      @Override
      protected void h() {
         if (this.t-- <= 0) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, this.j, this.k, this.l);
         }
      }

      @Override
      protected void i() {
         this.j *= 0.02;
         this.k *= 0.02;
         this.l *= 0.02;
      }
   }

   static class c extends fpx {
      c(fns $$0, double $$1, double $$2, double $$3, eeq $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fpx.e {
      d(fns $$0, double $$1, double $$2, double $$3, eeq $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            arr $$0 = this.g() == ees.e ? ars.gT : ars.gU;
            float $$1 = auo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, art.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fpx.f {
      protected final jv b;

      e(fns $$0, double $$1, double $$2, double $$3, eeq $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.b = $$5;
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
         }
      }
   }

   static class f extends fpx {
      f(fns $$0, double $$1, double $$2, double $$3, eeq $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fns $$0, double $$1, double $$2, double $$3, eeq $$4, int $$5) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = $$5;
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
         }
      }
   }

   static class g extends fpx.e {
      g(fns $$0, double $$1, double $$2, double $$3, eeq $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = auo.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, ars.bF, art.e, $$0, 1.0F, false);
         }
      }
   }
}
