public class flv extends fnq {
   private final ebd b;
   protected boolean a;

   flv(fjr $$0, double $$1, double $$2, double $$3, ebd $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ebd g() {
      return this.b;
   }

   @Override
   public fmu b() {
      return fmu.b;
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
            if (this.b != ebf.a) {
               ht $$0 = ht.a(this.g, this.h, this.i);
               ebe $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cqf)this.c, $$0))) {
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

   public static fnq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.b($$1, $$2, $$3, $$4, ebf.c, js.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fnq b(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.e($$1, $$2, $$3, $$4, ebf.c, js.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fnq c(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new flv.a($$1, $$2, $$3, $$4, ebf.e, js.k);
   }

   public static fnq d(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.e($$1, $$2, $$3, $$4, ebf.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fnq e(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.c($$1, $$2, $$3, $$4, ebf.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fnq f(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv.b $$8 = new flv.b($$1, $$2, $$3, $$4, ebf.a, js.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fnq g(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.g($$1, $$2, $$3, $$4, ebf.a, js.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fnq h(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.c($$1, $$2, $$3, $$4, ebf.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fnq i(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.b($$1, $$2, $$3, $$4, ebf.c, js.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fnq j(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.d($$1, $$2, $$3, $$4, ebf.c, js.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fnq k(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new flv.a($$1, $$2, $$3, $$4, ebf.e, js.aG);
   }

   public static fnq l(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.d($$1, $$2, $$3, $$4, ebf.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fnq m(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.f($$1, $$2, $$3, $$4, ebf.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fnq n(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / asy.b($$1.E_(), 0.1F, 0.9F));
      flv $$9 = new flv.f($$1, $$2, $$3, $$4, ebf.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fnq o(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv.b $$8 = new flv.b($$1, $$2, $$3, $$4, ebf.a, js.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fnq p(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.e($$1, $$2, $$3, $$4, ebf.a, js.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fnq q(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      flv $$8 = new flv.c($$1, $$2, $$3, $$4, ebf.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends flv.b {
      a(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, jq $$5) {
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

   static class b extends flv {
      private final jq b;

      b(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, jq $$5) {
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

   static class c extends flv {
      c(fjr $$0, double $$1, double $$2, double $$3, ebd $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends flv.e {
      d(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aqc $$0 = this.g() == ebf.e ? aqd.gs : aqd.gt;
            float $$1 = asy.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aqe.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends flv.f {
      protected final jq b;

      e(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, jq $$5) {
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

   static class f extends flv {
      f(fjr $$0, double $$1, double $$2, double $$3, ebd $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, int $$5) {
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

   static class g extends flv.e {
      g(fjr $$0, double $$1, double $$2, double $$3, ebd $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = asy.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aqd.bF, aqe.e, $$0, 1.0F, false);
         }
      }
   }
}
