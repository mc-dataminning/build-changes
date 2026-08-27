public class foy extends fqw {
   private final edy b;
   protected boolean a;

   foy(fmt $$0, double $$1, double $$2, double $$3, edy $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected edy g() {
      return this.b;
   }

   @Override
   public fqa b() {
      return fqa.b;
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
            if (this.b != eea.a) {
               hv $$0 = hv.a(this.g, this.h, this.i);
               edz $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cse)this.c, $$0))) {
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

   public static fqw a(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.b($$1, $$2, $$3, $$4, eea.c, jv.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fqw b(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.e($$1, $$2, $$3, $$4, eea.c, jv.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fqw c(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new foy.a($$1, $$2, $$3, $$4, eea.e, jv.k);
   }

   public static fqw d(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.e($$1, $$2, $$3, $$4, eea.e, jv.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fqw e(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.c($$1, $$2, $$3, $$4, eea.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fqw f(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy.b $$8 = new foy.b($$1, $$2, $$3, $$4, eea.a, jv.at);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fqw g(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.g($$1, $$2, $$3, $$4, eea.a, jv.au);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fqw h(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.c($$1, $$2, $$3, $$4, eea.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fqw i(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.b($$1, $$2, $$3, $$4, eea.c, jv.aL);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fqw j(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.d($$1, $$2, $$3, $$4, eea.c, jv.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fqw k(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new foy.a($$1, $$2, $$3, $$4, eea.e, jv.aJ);
   }

   public static fqw l(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.d($$1, $$2, $$3, $$4, eea.e, jv.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fqw m(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.f($$1, $$2, $$3, $$4, eea.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fqw n(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / aty.b($$1.F_(), 0.1F, 0.9F));
      foy $$9 = new foy.f($$1, $$2, $$3, $$4, eea.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fqw o(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy.b $$8 = new foy.b($$1, $$2, $$3, $$4, eea.a, jv.aC);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fqw p(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.e($$1, $$2, $$3, $$4, eea.a, jv.aD);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fqw q(jy $$0, fmt $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      foy $$8 = new foy.c($$1, $$2, $$3, $$4, eea.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends foy.b {
      a(fmt $$0, double $$1, double $$2, double $$3, edy $$4, jt $$5) {
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

   static class b extends foy {
      private final jt b;

      b(fmt $$0, double $$1, double $$2, double $$3, edy $$4, jt $$5) {
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

   static class c extends foy {
      c(fmt $$0, double $$1, double $$2, double $$3, edy $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends foy.e {
      d(fmt $$0, double $$1, double $$2, double $$3, edy $$4, jt $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            arb $$0 = this.g() == eea.e ? arc.gT : arc.gU;
            float $$1 = aty.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, ard.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends foy.f {
      protected final jt b;

      e(fmt $$0, double $$1, double $$2, double $$3, edy $$4, jt $$5) {
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

   static class f extends foy {
      f(fmt $$0, double $$1, double $$2, double $$3, edy $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fmt $$0, double $$1, double $$2, double $$3, edy $$4, int $$5) {
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

   static class g extends foy.e {
      g(fmt $$0, double $$1, double $$2, double $$3, edy $$4, jt $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = aty.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, arc.bF, ard.e, $$0, 1.0F, false);
         }
      }
   }
}
