import javax.annotation.Nullable;

public class chx extends cgw implements bvz, cmd {
   private static final ajy<Byte> a = akc.a(chx.class, aka.a);
   private static final byte b = 16;

   public chx(but<? extends chx> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cdf(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdt(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cco(this, coy.class, 6.0F));
      this.bS.a(4, new cdb(this));
      this.bT.a(1, new cdz<>(this, bvk.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clr));
   }

   public static bwp.a m() {
      return bvk.F().a(bwq.s, 4.0).a(bwq.v, 0.2F);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.p());
   }

   @Override
   public void a(tq $$0) {
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
      if (this.dV() instanceof ard $$0) {
         if (this.dV().t(this.dv()).a(awo.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().b(dgf.c)) {
            return;
         }

         dwy $$1 = djp.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayz.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayz.a(this.dC());
            int $$5 = ayz.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dgm)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ebu.i, $$6, ebu.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvi $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ard $$6) {
         cwq $$7 = new cwq(cwu.rj);
         cpr.a(new cpw($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awa.zu, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(cwu.sS) && this.a()) {
         if (this.dV() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ebu.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwq $$2) {
      $$0.a(null, this, awa.zv, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, evo.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
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
   protected avz u() {
      return awa.zr;
   }

   @Nullable
   @Override
   protected avz e(btc $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zs;
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
