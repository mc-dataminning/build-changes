import javax.annotation.Nullable;

public class chv extends cgu implements bvx, cmb {
   private static final ajy<Byte> a = akc.a(chv.class, aka.a);
   private static final byte b = 16;

   public chv(bur<? extends chv> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cdd(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdr(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccm(this, cow.class, 6.0F));
      this.bS.a(4, new ccz(this));
      this.bT.a(1, new cdx<>(this, bvi.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clp));
   }

   public static bwn.a m() {
      return bvi.F().a(bwo.s, 4.0).a(bwo.v, 0.2F);
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

         if (!$$0.O().b(dgd.c)) {
            return;
         }

         dww $$1 = djn.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayz.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayz.a(this.dC());
            int $$5 = ayz.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dgk)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ebs.i, $$6, ebs.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvg $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ard $$6) {
         cwo $$7 = new cwo(cws.rj);
         cpp.a(new cpu($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awa.zu, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.sS) && this.a()) {
         if (this.dV() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ebs.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwo $$2) {
      $$0.a(null, this, awa.zv, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, evm.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
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
   protected avz e(bta $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zs;
   }

   @Override
   public faz cT() {
      return new faz(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
