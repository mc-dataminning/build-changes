public class fns extends fpo {
   private final ecw b;
   protected boolean a;

   fns(flo $$0, double $$1, double $$2, double $$3, ecw $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ecw g() {
      return this.b;
   }

   @Override
   public fos b() {
      return fos.b;
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
            if (this.b != ecy.a) {
               hx $$0 = hx.a(this.g, this.h, this.i);
               ecx $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((crl)this.c, $$0))) {
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

   public static fpo a(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.b($$1, $$2, $$3, $$4, ecy.c, jw.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpo b(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.e($$1, $$2, $$3, $$4, ecy.c, jw.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpo c(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fns.a($$1, $$2, $$3, $$4, ecy.e, jw.k);
   }

   public static fpo d(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.e($$1, $$2, $$3, $$4, ecy.e, jw.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpo e(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.c($$1, $$2, $$3, $$4, ecy.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpo f(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns.b $$8 = new fns.b($$1, $$2, $$3, $$4, ecy.a, jw.ar);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fpo g(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.g($$1, $$2, $$3, $$4, ecy.a, jw.as);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fpo h(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.c($$1, $$2, $$3, $$4, ecy.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fpo i(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.b($$1, $$2, $$3, $$4, ecy.c, jw.aJ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpo j(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.d($$1, $$2, $$3, $$4, ecy.c, jw.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpo k(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fns.a($$1, $$2, $$3, $$4, ecy.e, jw.aH);
   }

   public static fpo l(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.d($$1, $$2, $$3, $$4, ecy.e, jw.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpo m(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.f($$1, $$2, $$3, $$4, ecy.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fpo n(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / atq.b($$1.F_(), 0.1F, 0.9F));
      fns $$9 = new fns.f($$1, $$2, $$3, $$4, ecy.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fpo o(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns.b $$8 = new fns.b($$1, $$2, $$3, $$4, ecy.a, jw.aA);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fpo p(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.e($$1, $$2, $$3, $$4, ecy.a, jw.aB);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fpo q(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fns $$8 = new fns.c($$1, $$2, $$3, $$4, ecy.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fns.b {
      a(flo $$0, double $$1, double $$2, double $$3, ecw $$4, ju $$5) {
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

   static class b extends fns {
      private final ju b;

      b(flo $$0, double $$1, double $$2, double $$3, ecw $$4, ju $$5) {
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

   static class c extends fns {
      c(flo $$0, double $$1, double $$2, double $$3, ecw $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fns.e {
      d(flo $$0, double $$1, double $$2, double $$3, ecw $$4, ju $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aqu $$0 = this.g() == ecy.e ? aqv.gK : aqv.gL;
            float $$1 = atq.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aqw.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fns.f {
      protected final ju b;

      e(flo $$0, double $$1, double $$2, double $$3, ecw $$4, ju $$5) {
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

   static class f extends fns {
      f(flo $$0, double $$1, double $$2, double $$3, ecw $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(flo $$0, double $$1, double $$2, double $$3, ecw $$4, int $$5) {
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

   static class g extends fns.e {
      g(flo $$0, double $$1, double $$2, double $$3, ecw $$4, ju $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = atq.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aqv.bF, aqw.e, $$0, 1.0F, false);
         }
      }
   }
}
