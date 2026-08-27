public class fna extends fow {
   private final ecf b;
   protected boolean a;

   fna(fkw $$0, double $$1, double $$2, double $$3, ecf $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected ecf g() {
      return this.b;
   }

   @Override
   public fnz b() {
      return fnz.b;
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
            if (this.b != ech.a) {
               ht $$0 = ht.a(this.g, this.h, this.i);
               ecg $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cqy)this.c, $$0))) {
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

   public static fow a(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.b($$1, $$2, $$3, $$4, ech.c, js.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fow b(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.e($$1, $$2, $$3, $$4, ech.c, js.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fow c(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fna.a($$1, $$2, $$3, $$4, ech.e, js.k);
   }

   public static fow d(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.e($$1, $$2, $$3, $$4, ech.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fow e(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.c($$1, $$2, $$3, $$4, ech.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fow f(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna.b $$8 = new fna.b($$1, $$2, $$3, $$4, ech.a, js.ar);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fow g(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.g($$1, $$2, $$3, $$4, ech.a, js.as);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fow h(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.c($$1, $$2, $$3, $$4, ech.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fow i(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.b($$1, $$2, $$3, $$4, ech.c, js.aJ);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fow j(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.d($$1, $$2, $$3, $$4, ech.c, js.ah);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fow k(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fna.a($$1, $$2, $$3, $$4, ech.e, js.aH);
   }

   public static fow l(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.d($$1, $$2, $$3, $$4, ech.e, js.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fow m(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.f($$1, $$2, $$3, $$4, ech.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fow n(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / ati.b($$1.E_(), 0.1F, 0.9F));
      fna $$9 = new fna.f($$1, $$2, $$3, $$4, ech.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fow o(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna.b $$8 = new fna.b($$1, $$2, $$3, $$4, ech.a, js.aA);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fow p(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.e($$1, $$2, $$3, $$4, ech.a, js.aB);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fow q(jv $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fna $$8 = new fna.c($$1, $$2, $$3, $$4, ech.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fna.b {
      a(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, jq $$5) {
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

   static class b extends fna {
      private final jq b;

      b(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, jq $$5) {
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

   static class c extends fna {
      c(fkw $$0, double $$1, double $$2, double $$3, ecf $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fna.e {
      d(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aqm $$0 = this.g() == ech.e ? aqn.gu : aqn.gv;
            float $$1 = ati.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aqo.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fna.f {
      protected final jq b;

      e(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, jq $$5) {
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

   static class f extends fna {
      f(fkw $$0, double $$1, double $$2, double $$3, ecf $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, int $$5) {
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

   static class g extends fna.e {
      g(fkw $$0, double $$1, double $$2, double $$3, ecf $$4, jq $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = ati.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aqn.bF, aqo.e, $$0, 1.0F, false);
         }
      }
   }
}
