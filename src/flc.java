public class flc extends fmw {
   private final ean b;
   protected boolean a;

   flc(fiz $$0, double $$1, double $$2, double $$3, ean $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ean g() {
      return this.b;
   }

   @Override
   public fma b() {
      return fma.b;
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
            if (this.b != eap.a) {
               gw $$0 = gw.a(this.g, this.h, this.i);
               eao $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cpd)this.c, $$0))) {
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

   public static fmw a(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.b($$1, $$2, $$3, $$4, eap.c, ix.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmw b(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.e($$1, $$2, $$3, $$4, eap.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmw c(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new flc.a($$1, $$2, $$3, $$4, eap.e, ix.k);
   }

   public static fmw d(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.e($$1, $$2, $$3, $$4, eap.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmw e(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.c($$1, $$2, $$3, $$4, eap.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmw f(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc.b $$8 = new flc.b($$1, $$2, $$3, $$4, eap.a, ix.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fmw g(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.g($$1, $$2, $$3, $$4, eap.a, ix.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fmw h(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.c($$1, $$2, $$3, $$4, eap.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fmw i(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.b($$1, $$2, $$3, $$4, eap.c, ix.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmw j(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.d($$1, $$2, $$3, $$4, eap.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmw k(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new flc.a($$1, $$2, $$3, $$4, eap.e, ix.aG);
   }

   public static fmw l(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.d($$1, $$2, $$3, $$4, eap.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmw m(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.f($$1, $$2, $$3, $$4, eap.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fmw n(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ary.b($$1.D_(), 0.1F, 0.9F));
      flc $$9 = new flc.f($$1, $$2, $$3, $$4, eap.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fmw o(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc.b $$8 = new flc.b($$1, $$2, $$3, $$4, eap.a, ix.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmw p(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.e($$1, $$2, $$3, $$4, eap.a, ix.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmw q(ja $$0, fiz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flc $$8 = new flc.c($$1, $$2, $$3, $$4, eap.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends flc.b {
      a(fiz $$0, double $$1, double $$2, double $$3, ean $$4, iv $$5) {
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

   static class b extends flc {
      private final iv b;

      b(fiz $$0, double $$1, double $$2, double $$3, ean $$4, iv $$5) {
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

   static class c extends flc {
      c(fiz $$0, double $$1, double $$2, double $$3, ean $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends flc.e {
      d(fiz $$0, double $$1, double $$2, double $$3, ean $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            ape $$0 = this.g() == eap.e ? apf.gq : apf.gr;
            float $$1 = ary.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, apg.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends flc.f {
      protected final iv b;

      e(fiz $$0, double $$1, double $$2, double $$3, ean $$4, iv $$5) {
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

   static class f extends flc {
      f(fiz $$0, double $$1, double $$2, double $$3, ean $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fiz $$0, double $$1, double $$2, double $$3, ean $$4, int $$5) {
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

   static class g extends flc.e {
      g(fiz $$0, double $$1, double $$2, double $$3, ean $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ary.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, apf.bF, apg.e, $$0, 1.0F, false);
         }
      }
   }
}
