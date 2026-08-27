public class fpv extends frt {
   private final eep b;
   protected boolean a;

   fpv(fnq $$0, double $$1, double $$2, double $$3, eep $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eep g() {
      return this.b;
   }

   @Override
   public fqx b() {
      return fqx.b;
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
            if (this.b != eer.a) {
               hx $$0 = hx.a(this.g, this.h, this.i);
               eeq $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((csu)this.c, $$0))) {
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

   public static frt a(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.b($$1, $$2, $$3, $$4, eer.c, jx.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frt b(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.e($$1, $$2, $$3, $$4, eer.c, jx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frt c(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fpv.a($$1, $$2, $$3, $$4, eer.e, jx.k);
   }

   public static frt d(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.e($$1, $$2, $$3, $$4, eer.e, jx.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frt e(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.c($$1, $$2, $$3, $$4, eer.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frt f(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv.b $$8 = new fpv.b($$1, $$2, $$3, $$4, eer.a, jx.at);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static frt g(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.g($$1, $$2, $$3, $$4, eer.a, jx.au);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static frt h(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.c($$1, $$2, $$3, $$4, eer.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static frt i(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.b($$1, $$2, $$3, $$4, eer.c, jx.aL);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frt j(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.d($$1, $$2, $$3, $$4, eer.c, jx.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static frt k(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fpv.a($$1, $$2, $$3, $$4, eer.e, jx.aJ);
   }

   public static frt l(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.d($$1, $$2, $$3, $$4, eer.e, jx.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static frt m(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.f($$1, $$2, $$3, $$4, eer.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static frt n(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / aun.b($$1.F_(), 0.1F, 0.9F));
      fpv $$9 = new fpv.f($$1, $$2, $$3, $$4, eer.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static frt o(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv.b $$8 = new fpv.b($$1, $$2, $$3, $$4, eer.a, jx.aC);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static frt p(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.e($$1, $$2, $$3, $$4, eer.a, jx.aD);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static frt q(ka $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fpv $$8 = new fpv.c($$1, $$2, $$3, $$4, eer.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fpv.b {
      a(fnq $$0, double $$1, double $$2, double $$3, eep $$4, jv $$5) {
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

   static class b extends fpv {
      private final jv b;

      b(fnq $$0, double $$1, double $$2, double $$3, eep $$4, jv $$5) {
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

   static class c extends fpv {
      c(fnq $$0, double $$1, double $$2, double $$3, eep $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fpv.e {
      d(fnq $$0, double $$1, double $$2, double $$3, eep $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            arq $$0 = this.g() == eer.e ? arr.gT : arr.gU;
            float $$1 = aun.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, ars.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fpv.f {
      protected final jv b;

      e(fnq $$0, double $$1, double $$2, double $$3, eep $$4, jv $$5) {
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

   static class f extends fpv {
      f(fnq $$0, double $$1, double $$2, double $$3, eep $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fnq $$0, double $$1, double $$2, double $$3, eep $$4, int $$5) {
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

   static class g extends fpv.e {
      g(fnq $$0, double $$1, double $$2, double $$3, eep $$4, jv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = aun.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, arr.bF, ars.e, $$0, 1.0F, false);
         }
      }
   }
}
