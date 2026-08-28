import javax.annotation.Nullable;

public class chw extends cgv implements bvy, cmc {
   private static final ajy<Byte> a = akc.a(chw.class, aka.a);
   private static final byte b = 16;

   public chw(bus<? extends chw> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cde(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cds(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccn(this, cox.class, 6.0F));
      this.bS.a(4, new cda(this));
      this.bT.a(1, new cdy<>(this, bvj.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clq));
   }

   public static bwo.a m() {
      return bvj.F().a(bwp.s, 4.0).a(bwp.v, 0.2F);
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

         if (!$$0.O().b(dge.c)) {
            return;
         }

         dwx $$1 = djo.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayz.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayz.a(this.dC());
            int $$5 = ayz.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dgl)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(ebt.i, $$6, ebt.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvh $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ard $$6) {
         cwp $$7 = new cwp(cwt.rj);
         cpq.a(new cpv($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awa.zu, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.sS) && this.a()) {
         if (this.dV() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ebt.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwp $$2) {
      $$0.a(null, this, awa.zv, $$1, 1.0F, 1.0F);
      this.x(false);
      this.a($$0, evn.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
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
   protected avz e(btb $$0) {
      return awa.zt;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zs;
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
