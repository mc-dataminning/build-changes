public class fkc extends flw {
   private final eaa b;
   protected boolean a;

   fkc(fie $$0, double $$1, double $$2, double $$3, eaa $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eaa g() {
      return this.b;
   }

   @Override
   public fla b() {
      return fla.b;
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
            if (this.b != eac.a) {
               gv $$0 = gv.a(this.g, this.h, this.i);
               eab $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((coq)this.c, $$0))) {
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

   public static flw a(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.b($$1, $$2, $$3, $$4, eac.c, iw.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static flw b(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.e($$1, $$2, $$3, $$4, eac.c, iw.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static flw c(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkc.a($$1, $$2, $$3, $$4, eac.e, iw.k);
   }

   public static flw d(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.e($$1, $$2, $$3, $$4, eac.e, iw.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static flw e(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.c($$1, $$2, $$3, $$4, eac.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static flw f(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc.b $$8 = new fkc.b($$1, $$2, $$3, $$4, eac.a, iw.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static flw g(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.g($$1, $$2, $$3, $$4, eac.a, iw.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static flw h(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.c($$1, $$2, $$3, $$4, eac.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static flw i(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.b($$1, $$2, $$3, $$4, eac.c, iw.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static flw j(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.d($$1, $$2, $$3, $$4, eac.c, iw.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static flw k(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkc.a($$1, $$2, $$3, $$4, eac.e, iw.aG);
   }

   public static flw l(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.d($$1, $$2, $$3, $$4, eac.e, iw.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static flw m(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.f($$1, $$2, $$3, $$4, eac.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static flw n(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / aro.b($$1.y_(), 0.1F, 0.9F));
      fkc $$9 = new fkc.f($$1, $$2, $$3, $$4, eac.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static flw o(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc.b $$8 = new fkc.b($$1, $$2, $$3, $$4, eac.a, iw.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static flw p(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.e($$1, $$2, $$3, $$4, eac.a, iw.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static flw q(iz $$0, fie $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkc $$8 = new fkc.c($$1, $$2, $$3, $$4, eac.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fkc.b {
      a(fie $$0, double $$1, double $$2, double $$3, eaa $$4, iu $$5) {
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

   static class b extends fkc {
      private final iu b;

      b(fie $$0, double $$1, double $$2, double $$3, eaa $$4, iu $$5) {
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

   static class c extends fkc {
      c(fie $$0, double $$1, double $$2, double $$3, eaa $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fkc.e {
      d(fie $$0, double $$1, double $$2, double $$3, eaa $$4, iu $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aot $$0 = this.g() == eac.e ? aou.gq : aou.gr;
            float $$1 = aro.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aov.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fkc.f {
      protected final iu b;

      e(fie $$0, double $$1, double $$2, double $$3, eaa $$4, iu $$5) {
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

   static class f extends fkc {
      f(fie $$0, double $$1, double $$2, double $$3, eaa $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fie $$0, double $$1, double $$2, double $$3, eaa $$4, int $$5) {
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

   static class g extends fkc.e {
      g(fie $$0, double $$1, double $$2, double $$3, eaa $$4, iu $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = aro.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aou.bF, aov.e, $$0, 1.0F, false);
         }
      }
   }
}
