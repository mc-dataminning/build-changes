public class fkv extends fmp {
   private final eag b;
   protected boolean a;

   fkv(fis $$0, double $$1, double $$2, double $$3, eag $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eag g() {
      return this.b;
   }

   @Override
   public flt b() {
      return flt.b;
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
            if (this.b != eai.a) {
               gw $$0 = gw.a(this.g, this.h, this.i);
               eah $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cow)this.c, $$0))) {
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

   public static fmp a(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.b($$1, $$2, $$3, $$4, eai.c, ix.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmp b(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.e($$1, $$2, $$3, $$4, eai.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmp c(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkv.a($$1, $$2, $$3, $$4, eai.e, ix.k);
   }

   public static fmp d(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.e($$1, $$2, $$3, $$4, eai.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmp e(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.c($$1, $$2, $$3, $$4, eai.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmp f(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv.b $$8 = new fkv.b($$1, $$2, $$3, $$4, eai.a, ix.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fmp g(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.g($$1, $$2, $$3, $$4, eai.a, ix.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fmp h(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.c($$1, $$2, $$3, $$4, eai.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fmp i(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.b($$1, $$2, $$3, $$4, eai.c, ix.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmp j(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.d($$1, $$2, $$3, $$4, eai.c, ix.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmp k(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkv.a($$1, $$2, $$3, $$4, eai.e, ix.aG);
   }

   public static fmp l(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.d($$1, $$2, $$3, $$4, eai.e, ix.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmp m(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.f($$1, $$2, $$3, $$4, eai.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fmp n(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ars.b($$1.y_(), 0.1F, 0.9F));
      fkv $$9 = new fkv.f($$1, $$2, $$3, $$4, eai.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fmp o(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv.b $$8 = new fkv.b($$1, $$2, $$3, $$4, eai.a, ix.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmp p(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.e($$1, $$2, $$3, $$4, eai.a, ix.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmp q(ja $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkv $$8 = new fkv.c($$1, $$2, $$3, $$4, eai.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fkv.b {
      a(fis $$0, double $$1, double $$2, double $$3, eag $$4, iv $$5) {
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

   static class b extends fkv {
      private final iv b;

      b(fis $$0, double $$1, double $$2, double $$3, eag $$4, iv $$5) {
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

   static class c extends fkv {
      c(fis $$0, double $$1, double $$2, double $$3, eag $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fkv.e {
      d(fis $$0, double $$1, double $$2, double $$3, eag $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aoy $$0 = this.g() == eai.e ? aoz.gq : aoz.gr;
            float $$1 = ars.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, apa.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fkv.f {
      protected final iv b;

      e(fis $$0, double $$1, double $$2, double $$3, eag $$4, iv $$5) {
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

   static class f extends fkv {
      f(fis $$0, double $$1, double $$2, double $$3, eag $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fis $$0, double $$1, double $$2, double $$3, eag $$4, int $$5) {
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

   static class g extends fkv.e {
      g(fis $$0, double $$1, double $$2, double $$3, eag $$4, iv $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ars.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aoz.bF, apa.e, $$0, 1.0F, false);
         }
      }
   }
}
