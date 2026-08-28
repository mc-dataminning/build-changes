import javax.annotation.Nullable;

public class crd extends cqe {
   private static final alc<Byte> f = alg.a(crd.class, ale.a);
   private static final alc<Boolean> g = alg.a(crd.class, ale.k);
   private boolean h;
   public int e;

   public crd(bvr<? extends crd> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public crd(dhi $$0, bwg $$1, cxp $$2) {
      super(bvr.bz, $$1, $$0, $$2, null);
      this.al.a(f, this.b($$2));
      this.al.a(g, $$2.B());
   }

   public crd(dhi $$0, double $$1, double $$2, double $$3, cxp $$4) {
      super(bvr.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(f, this.b($$4));
      this.al.a(g, $$4.B());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(f, (byte)0);
      $$0.a(g, false);
   }

   @Override
   public void h() {
      if (this.b > 4) {
         this.h = true;
      }

      bvk $$0 = this.p();
      int $$1 = this.al.a(f);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dW() instanceof ash $$2 && this.c == cqe.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cpx) && this.du().f($$0.bF()) < (double)$$0.dr() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fby $$3 = $$0.bF().d(this.du());
            this.o(this.dB(), this.dD() + $$3.e * 0.015 * (double)$$1, this.dH());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dz().c(0.95).e($$3.d().c($$4)));
            if (this.e == 0) {
               this.a(axf.Ab, 10.0F, 1.0F);
            }

            this.e++;
         }
      }

      super.h();
   }

   private boolean G() {
      bvk $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof asi) || !$$0.aa_();
   }

   public boolean D() {
      return this.al.a(g);
   }

   @Nullable
   @Override
   protected fbv c(fby $$0, fby $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fbv $$0) {
      bvk $$1 = $$0.a();
      float $$2 = 8.0F;
      bvk $$3 = this.p();
      bua $$4 = this.dX().a(this, (bvk)($$3 == null ? this : $$3));
      if (this.dW() instanceof ash $$5) {
         $$2 = deb.a($$5, this.ea(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bvr.O) {
            return;
         }

         if (this.dW() instanceof ash $$6) {
            deb.a($$6, $$1, $$4, this.ea(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bwg $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cqr.b, $$1, this.p(), false);
      this.h(this.dz().d(0.02, 0.2, 0.02));
      this.a(axf.zZ, 1.0F, 1.0F);
   }

   @Override
   protected void a(ash $$0, fbu $$1, cxp $$2) {
      fby $$3 = $$1.b().a($$1.g());
      deb.a($$0, $$2, this.p() instanceof bwg $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cxp ea() {
      return this.w();
   }

   @Override
   protected boolean a(cpx $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cxp v() {
      return new cxp(cxt.wI);
   }

   @Override
   protected axe s() {
      return axf.Aa;
   }

   @Override
   public void a_(cpx $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(f, this.b(this.w()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cxp $$0) {
      return this.dW() instanceof ash $$1 ? (byte)bae.a(deb.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(f);
      if (this.c != cqe.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float A() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
