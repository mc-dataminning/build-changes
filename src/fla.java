public class fla extends fmu {
   private final eal b;
   protected boolean a;

   fla(fix $$0, double $$1, double $$2, double $$3, eal $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eal g() {
      return this.b;
   }

   @Override
   public fly b() {
      return fly.b;
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
            if (this.b != ean.a) {
               gw $$0 = gw.a(this.g, this.h, this.i);
               eam $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cpb)this.c, $$0))) {
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

   public static fmu a(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.b($$1, $$2, $$3, $$4, ean.c, ix.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmu b(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.e($$1, $$2, $$3, $$4, ean.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmu c(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fla.a($$1, $$2, $$3, $$4, ean.e, ix.k);
   }

   public static fmu d(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.e($$1, $$2, $$3, $$4, ean.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmu e(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.c($$1, $$2, $$3, $$4, ean.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmu f(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla.b $$8 = new fla.b($$1, $$2, $$3, $$4, ean.a, ix.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fmu g(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.g($$1, $$2, $$3, $$4, ean.a, ix.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fmu h(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.c($$1, $$2, $$3, $$4, ean.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fmu i(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.b($$1, $$2, $$3, $$4, ean.c, ix.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmu j(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.d($$1, $$2, $$3, $$4, ean.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmu k(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fla.a($$1, $$2, $$3, $$4, ean.e, ix.aG);
   }

   public static fmu l(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.d($$1, $$2, $$3, $$4, ean.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmu m(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.f($$1, $$2, $$3, $$4, ean.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fmu n(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / arx.b($$1.D_(), 0.1F, 0.9F));
      fla $$9 = new fla.f($$1, $$2, $$3, $$4, ean.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fmu o(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla.b $$8 = new fla.b($$1, $$2, $$3, $$4, ean.a, ix.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmu p(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.e($$1, $$2, $$3, $$4, ean.a, ix.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmu q(ja $$0, fix $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fla $$8 = new fla.c($$1, $$2, $$3, $$4, ean.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fla.b {
      a(fix $$0, double $$1, double $$2, double $$3, eal $$4, iv $$5) {
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

   static class b extends fla {
      private final iv b;

      b(fix $$0, double $$1, double $$2, double $$3, eal $$4, iv $$5) {
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

   static class c extends fla {
      c(fix $$0, double $$1, double $$2, double $$3, eal $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fla.e {
      d(fix $$0, double $$1, double $$2, double $$3, eal $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            apd $$0 = this.g() == ean.e ? ape.gq : ape.gr;
            float $$1 = arx.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, apf.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fla.f {
      protected final iv b;

      e(fix $$0, double $$1, double $$2, double $$3, eal $$4, iv $$5) {
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

   static class f extends fla {
      f(fix $$0, double $$1, double $$2, double $$3, eal $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fix $$0, double $$1, double $$2, double $$3, eal $$4, int $$5) {
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

   static class g extends fla.e {
      g(fix $$0, double $$1, double $$2, double $$3, eal $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = arx.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, ape.bF, apf.e, $$0, 1.0F, false);
         }
      }
   }
}
