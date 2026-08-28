public abstract class cgs extends chy implements cgy {
   private static final ajx<Boolean> a = akb.a(cgs.class, ajz.k);

   public cgs(buq<? extends cgs> $$0, dgg $$1) {
      super($$0, $$1);
      this.bP = new cgs.a(this);
   }

   public static bwm.a m() {
      return bvh.C().a(bwn.s, 3.0);
   }

   @Override
   public boolean X() {
      return super.X() || this.p();
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Override
   public int af() {
      return 8;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   public boolean p() {
      return this.al.a(a);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("FromBucket"));
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new ccw(this, 1.25));
      this.bS.a(2, new cbk<>(this, cov.class, 8.0F, 1.6, 1.4, buo.f::test));
      this.bS.a(4, new cgs.b(this));
   }

   @Override
   protected cer b(dgg $$0) {
      return new cet(this, $$0);
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(0.01F, $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
         if (this.O_() == null) {
            this.h(this.dz().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void d_() {
      if (!this.bj() && this.aJ() && this.Q) {
         this.h(this.dz().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.05F), 0.4F, (double)((this.ae.i() * 2.0F - 1.0F) * 0.05F)));
         this.d(false);
         this.ar = true;
         this.b(this.gp());
      }

      super.d_();
   }

   @Override
   protected bsi b(cov $$0, bsh $$1) {
      return cgy.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwn $$0) {
      cgy.a(this, $$0);
   }

   @Override
   public void h(tq $$0) {
      cgy.a(this, $$0);
   }

   @Override
   public avy t() {
      return avz.dl;
   }

   protected boolean x() {
      return true;
   }

   protected abstract avy gp();

   @Override
   protected avy aV() {
      return avz.jv;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
   }

   static class a extends cbg {
      private final cgs l;

      a(cgs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.a(awu.a)) {
            this.l.h(this.l.dz().b(0.0, 0.005, 0.0));
         }

         if (this.k == cbg.a.b && !this.l.L().k()) {
            float $$0 = (float)(this.h * this.l.h(bwn.v));
            this.l.C(ayy.h(0.125F, this.l.fp(), $$0));
            double $$1 = this.e - this.l.dB();
            double $$2 = this.f - this.l.dD();
            double $$3 = this.g - this.l.dH();
            if ($$2 != 0.0) {
               double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
               this.l.h(this.l.dz().b(0.0, (double)this.l.fp() * ($$2 / $$4) * 0.1, 0.0));
            }

            if ($$1 != 0.0 || $$3 != 0.0) {
               float $$5 = (float)(ayy.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.v(this.b(this.l.dM(), $$5, 90.0F));
               this.l.aX = this.l.dM();
            }
         } else {
            this.l.C(0.0F);
         }
      }
   }

   static class b extends cdb {
      private final cgs i;

      public b(cgs $$0) {
         super($$0, 1.0, 40);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.x() && super.b();
      }
   }
}
