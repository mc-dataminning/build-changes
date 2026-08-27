public class fnn extends fpj {
   private final ecr b;
   protected boolean a;

   fnn(flj $$0, double $$1, double $$2, double $$3, ecr $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ecr g() {
      return this.b;
   }

   @Override
   public fom b() {
      return fom.b;
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
            if (this.b != ect.a) {
               ht $$0 = ht.a(this.g, this.h, this.i);
               ecs $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((crg)this.c, $$0))) {
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

   public static fpj a(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.b($$1, $$2, $$3, $$4, ect.c, js.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpj b(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.e($$1, $$2, $$3, $$4, ect.c, js.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpj c(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fnn.a($$1, $$2, $$3, $$4, ect.e, js.k);
   }

   public static fpj d(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.e($$1, $$2, $$3, $$4, ect.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpj e(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.c($$1, $$2, $$3, $$4, ect.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpj f(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn.b $$8 = new fnn.b($$1, $$2, $$3, $$4, ect.a, js.ar);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fpj g(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.g($$1, $$2, $$3, $$4, ect.a, js.as);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fpj h(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.c($$1, $$2, $$3, $$4, ect.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fpj i(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.b($$1, $$2, $$3, $$4, ect.c, js.aJ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpj j(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.d($$1, $$2, $$3, $$4, ect.c, js.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fpj k(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fnn.a($$1, $$2, $$3, $$4, ect.e, js.aH);
   }

   public static fpj l(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.d($$1, $$2, $$3, $$4, ect.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fpj m(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.f($$1, $$2, $$3, $$4, ect.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fpj n(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / atm.b($$1.E_(), 0.1F, 0.9F));
      fnn $$9 = new fnn.f($$1, $$2, $$3, $$4, ect.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fpj o(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn.b $$8 = new fnn.b($$1, $$2, $$3, $$4, ect.a, js.aA);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fpj p(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.e($$1, $$2, $$3, $$4, ect.a, js.aB);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fpj q(jv $$0, flj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fnn $$8 = new fnn.c($$1, $$2, $$3, $$4, ect.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fnn.b {
      a(flj $$0, double $$1, double $$2, double $$3, ecr $$4, jq $$5) {
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

   static class b extends fnn {
      private final jq b;

      b(flj $$0, double $$1, double $$2, double $$3, ecr $$4, jq $$5) {
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

   static class c extends fnn {
      c(flj $$0, double $$1, double $$2, double $$3, ecr $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fnn.e {
      d(flj $$0, double $$1, double $$2, double $$3, ecr $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aqq $$0 = this.g() == ect.e ? aqr.gK : aqr.gL;
            float $$1 = atm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aqs.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fnn.f {
      protected final jq b;

      e(flj $$0, double $$1, double $$2, double $$3, ecr $$4, jq $$5) {
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

   static class f extends fnn {
      f(flj $$0, double $$1, double $$2, double $$3, ecr $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(flj $$0, double $$1, double $$2, double $$3, ecr $$4, int $$5) {
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

   static class g extends fnn.e {
      g(flj $$0, double $$1, double $$2, double $$3, ecr $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = atm.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aqr.bF, aqs.e, $$0, 1.0F, false);
         }
      }
   }
}
