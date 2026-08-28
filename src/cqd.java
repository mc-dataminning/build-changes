public class cqd extends bva implements cqh {
   private static final float a = 12.25F;
   private static final ajx<cxh> b = akb.a(cqd.class, ajz.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cqd(bvi<? extends cqd> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqd(dgz $$0, double $$1, double $$2, double $$3) {
      this(bvi.W, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cxh $$0) {
      if ($$0.f()) {
         this.au().a(b, this.g());
      } else {
         this.au().a(b, $$0.c(1));
      }
   }

   @Override
   public cxh f() {
      return this.au().a(b);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(b, this.g());
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cQ().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(ji $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dz();
      double $$5 = $$3 - this.dF();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dz() + $$4 / $$6 * 12.0;
         this.e = this.dF() + $$5 / $$6 * 12.0;
         this.d = this.dB() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ae.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(ayz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.x((float)(ayz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dK();
         this.O = this.dM();
      }
   }

   @Override
   public void h() {
      super.h();
      fbx $$0 = this.dx();
      double $$1 = this.dz() + $$0.d;
      double $$2 = this.dB() + $$0.e;
      double $$3 = this.dF() + $$0.f;
      double $$4 = $$0.i();
      this.x(cqk.f(this.O, (float)(ayz.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.w(cqk.f(this.N, (float)(ayz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dU().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayz.d($$6, $$5);
         double $$9 = ayz.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dB() < this.d ? 1 : -1;
         $$0 = new fbx(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bj()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dU().a(lt.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dU()
            .a(lt.af, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dU().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dU().C) {
            this.a(awa.iC, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.dU().b(new clw(this.dU(), this.dz(), this.dB(), this.dF(), this.f()));
            } else {
               this.dU().c(2003, this.du(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Item", this.f().a(this.dW()));
   }

   @Override
   public void a(tq $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cxh.a(this.dW(), (un)$$0.p("Item")).orElse(this.g()));
      } else {
         this.a(this.g());
      }
   }

   private cxh g() {
      return new cxh(cxl.tr);
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
