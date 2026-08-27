public class fsk extends fuh {
   private final egv b;
   protected boolean a;

   fsk(fqe $$0, double $$1, double $$2, double $$3, egv $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected egv g() {
      return this.b;
   }

   @Override
   public ftl b() {
      return ftl.b;
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
            if (this.b != egx.a) {
               hz $$0 = hz.a(this.g, this.h, this.i);
               egw $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cux)this.c, $$0))) {
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

   public static fuh a(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.b($$1, $$2, $$3, $$4, egx.c, jz.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fuh b(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.e($$1, $$2, $$3, $$4, egx.c, jz.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fuh c(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fsk.a($$1, $$2, $$3, $$4, egx.e, jz.k);
   }

   public static fuh d(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.e($$1, $$2, $$3, $$4, egx.e, jz.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fuh e(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.c($$1, $$2, $$3, $$4, egx.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fuh f(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk.b $$8 = new fsk.b($$1, $$2, $$3, $$4, egx.a, jz.at);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fuh g(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.g($$1, $$2, $$3, $$4, egx.a, jz.au);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fuh h(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.c($$1, $$2, $$3, $$4, egx.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fuh i(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.b($$1, $$2, $$3, $$4, egx.c, jz.aL);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fuh j(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.d($$1, $$2, $$3, $$4, egx.c, jz.aj);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fuh k(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fsk.a($$1, $$2, $$3, $$4, egx.e, jz.aJ);
   }

   public static fuh l(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.d($$1, $$2, $$3, $$4, egx.e, jz.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fuh m(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.f($$1, $$2, $$3, $$4, egx.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fuh n(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / awi.b($$1.F_(), 0.1F, 0.9F));
      fsk $$9 = new fsk.f($$1, $$2, $$3, $$4, egx.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fuh o(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk.b $$8 = new fsk.b($$1, $$2, $$3, $$4, egx.a, jz.aC);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fuh p(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.e($$1, $$2, $$3, $$4, egx.a, jz.aD);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fuh q(kc $$0, fqe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fsk $$8 = new fsk.c($$1, $$2, $$3, $$4, egx.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fsk.b {
      a(fqe $$0, double $$1, double $$2, double $$3, egv $$4, jx $$5) {
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

   static class b extends fsk {
      private final jx b;

      b(fqe $$0, double $$1, double $$2, double $$3, egv $$4, jx $$5) {
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

   static class c extends fsk {
      c(fqe $$0, double $$1, double $$2, double $$3, egv $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fsk.e {
      d(fqe $$0, double $$1, double $$2, double $$3, egv $$4, jx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            atk $$0 = this.g() == egx.e ? atl.hj : atl.hk;
            float $$1 = awi.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, atm.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fsk.f {
      protected final jx b;

      e(fqe $$0, double $$1, double $$2, double $$3, egv $$4, jx $$5) {
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

   static class f extends fsk {
      f(fqe $$0, double $$1, double $$2, double $$3, egv $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fqe $$0, double $$1, double $$2, double $$3, egv $$4, int $$5) {
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

   static class g extends fsk.e {
      g(fqe $$0, double $$1, double $$2, double $$3, egv $$4, jx $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = awi.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, atl.bS, atm.e, $$0, 1.0F, false);
         }
      }
   }
}
