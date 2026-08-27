public class fkq extends fmk {
   private final eab b;
   protected boolean a;

   fkq(fin $$0, double $$1, double $$2, double $$3, eab $$4) {
      super($$0, $$1, $$2, $$3);
      this.b(0.01F, 0.01F);
      this.u = 0.06F;
      this.b = $$4;
   }

   protected eab g() {
      return this.b;
   }

   @Override
   public flo b() {
      return flo.b;
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
            if (this.b != ead.a) {
               gu $$0 = gu.a(this.g, this.h, this.i);
               eac $$1 = this.c.b_($$0);
               if ($$1.a() == this.b && this.h < (double)((float)$$0.v() + $$1.a((cor)this.c, $$0))) {
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

   public static fmk a(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.b($$1, $$2, $$3, $$4, ead.c, iv.n);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmk b(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.e($$1, $$2, $$3, $$4, ead.c, iv.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmk c(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkq.a($$1, $$2, $$3, $$4, ead.e, iv.k);
   }

   public static fmk d(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.e($$1, $$2, $$3, $$4, ead.e, iv.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmk e(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.c($$1, $$2, $$3, $$4, ead.e);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmk f(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq.b $$8 = new fkq.b($$1, $$2, $$3, $$4, ead.a, iv.aq);
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.622F, 0.508F, 0.082F);
      return $$8;
   }

   public static fmk g(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.g($$1, $$2, $$3, $$4, ead.a, iv.ar);
      $$8.u = 0.01F;
      $$8.a(0.582F, 0.448F, 0.082F);
      return $$8;
   }

   public static fmk h(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.c($$1, $$2, $$3, $$4, ead.a);
      $$8.t = (int)(128.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.522F, 0.408F, 0.082F);
      return $$8;
   }

   public static fmk i(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.b($$1, $$2, $$3, $$4, ead.c, iv.aI);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmk j(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.d($$1, $$2, $$3, $$4, ead.c, iv.ag);
      $$8.a(0.2F, 0.3F, 1.0F);
      return $$8;
   }

   public static fmk k(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      return new fkq.a($$1, $$2, $$3, $$4, ead.e, iv.aG);
   }

   public static fmk l(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.d($$1, $$2, $$3, $$4, ead.e, iv.l);
      $$8.a(1.0F, 0.2857143F, 0.083333336F);
      return $$8;
   }

   public static fmk m(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.f($$1, $$2, $$3, $$4, ead.a);
      $$8.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      $$8.u = 0.007F;
      $$8.a(0.92F, 0.782F, 0.72F);
      return $$8;
   }

   public static fmk n(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      int $$8 = (int)(64.0F / arp.b($$1.y_(), 0.1F, 0.9F));
      fkq $$9 = new fkq.f($$1, $$2, $$3, $$4, ead.a, $$8);
      $$9.u = 0.005F;
      $$9.a(0.32F, 0.5F, 0.22F);
      return $$9;
   }

   public static fmk o(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq.b $$8 = new fkq.b($$1, $$2, $$3, $$4, ead.a, iv.az);
      $$8.a = true;
      $$8.u *= 0.01F;
      $$8.t = 100;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmk p(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.e($$1, $$2, $$3, $$4, ead.a, iv.aA);
      $$8.a = true;
      $$8.u = 0.01F;
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   public static fmk q(iy $$0, fin $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      fkq $$8 = new fkq.c($$1, $$2, $$3, $$4, ead.a);
      $$8.a = true;
      $$8.t = (int)(28.0 / (Math.random() * 0.8 + 0.2));
      $$8.a(0.51171875F, 0.03125F, 0.890625F);
      return $$8;
   }

   static class a extends fkq.b {
      a(fin $$0, double $$1, double $$2, double $$3, eab $$4, it $$5) {
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

   static class b extends fkq {
      private final it b;

      b(fin $$0, double $$1, double $$2, double $$3, eab $$4, it $$5) {
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

   static class c extends fkq {
      c(fin $$0, double $$1, double $$2, double $$3, eab $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.t = (int)(16.0 / (Math.random() * 0.8 + 0.2));
      }
   }

   static class d extends fkq.e {
      d(fin $$0, double $$1, double $$2, double $$3, eab $$4, it $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            aov $$0 = this.g() == ead.e ? aow.gq : aow.gr;
            float $$1 = arp.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, $$0, aox.e, $$1, 1.0F, false);
         }
      }
   }

   static class e extends fkq.f {
      protected final it b;

      e(fin $$0, double $$1, double $$2, double $$3, eab $$4, it $$5) {
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

   static class f extends fkq {
      f(fin $$0, double $$1, double $$2, double $$3, eab $$4) {
         this($$0, $$1, $$2, $$3, $$4, (int)(64.0 / (Math.random() * 0.8 + 0.2)));
      }

      f(fin $$0, double $$1, double $$2, double $$3, eab $$4, int $$5) {
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

   static class g extends fkq.e {
      g(fin $$0, double $$1, double $$2, double $$3, eab $$4, it $$5) {
         super($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void i() {
         if (this.m) {
            this.k();
            this.c.a(this.b, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            float $$0 = arp.b(this.r, 0.3F, 1.0F);
            this.c.a(this.g, this.h, this.i, aow.bF, aox.e, $$0, 1.0F, false);
         }
      }
   }
}
