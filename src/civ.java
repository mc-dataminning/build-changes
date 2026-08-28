import javax.annotation.Nullable;

public class civ extends chu implements bwx, cnb {
   private static final alc<Byte> a = alg.a(civ.class, ale.a);
   private static final byte b = 16;

   public civ(bvr<? extends civ> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ced(this, 1.25, 20, 10.0F));
      this.bT.a(2, new cer(this, 1.0, 1.0000001E-5F));
      this.bT.a(3, new cdm(this, cpx.class, 6.0F));
      this.bT.a(4, new cdz(this));
      this.bU.a(1, new cex<>(this, bwi.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cmp));
   }

   public static bxn.a m() {
      return bwi.C().a(bxo.s, 4.0).a(bxo.v, 0.2F);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.p());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dW() instanceof ash $$0) {
         if (this.dW().t(this.dw()).a(axt.ae)) {
            this.a($$0, this.dX().d(), 1.0F);
         }

         if (!$$0.N().b(dhe.c)) {
            return;
         }

         dxv $$1 = dko.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = bae.a(this.dB() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = bae.a(this.dD());
            int $$5 = bae.a(this.dH() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            jh $$6 = new jh($$3, $$4, $$5);
            if (this.dW().a_($$6).l() && $$1.a((dhl)this.dW(), $$6)) {
               this.dW().b($$6, $$1);
               this.dW().a(ecr.i, $$6, ecr.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bwg $$0, float $$1) {
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.dF() - 1.1F;
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof ash $$6) {
         cxp $$7 = new cxp(cxt.ra);
         cqq.a(new cqv($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dD(), $$4, 1.6F, 12.0F));
      }

      this.a(axf.zf, 1.0F, 0.4F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.sJ) && this.a()) {
         if (this.dW() instanceof ash $$3) {
            this.a($$3, axg.h, $$2);
            this.a(ecr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   public void a(ash $$0, axg $$1, cxp $$2) {
      $$0.a(null, this, axf.zg, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, ewl.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bL() && this.p();
   }

   public boolean p() {
      return (this.al.a(a) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected axe u() {
      return axf.zc;
   }

   @Nullable
   @Override
   protected axe e(bua $$0) {
      return axf.ze;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.zd;
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.75F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
