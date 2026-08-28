import javax.annotation.Nullable;

public class chv extends cgu implements bvx, cmb {
   private static final ajx<Byte> a = akb.a(chv.class, ajz.a);
   private static final byte b = 16;

   public chv(bur<? extends chv> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cdd(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdr(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccm(this, cox.class, 6.0F));
      this.bS.a(4, new ccz(this));
      this.bT.a(1, new cdx<>(this, bvi.class, 10, true, false, ($$0, $$1) -> $$0 instanceof clp));
   }

   public static bwn.a m() {
      return bvi.C().a(bwo.s, 4.0).a(bwo.v, 0.2F);
   }

   @Override
   protected void a(akb.a $$0) {
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
      if (this.dW() instanceof arc $$0) {
         if (this.dW().t(this.dw()).a(awo.ae)) {
            this.a($$0, this.dX().d(), 1.0F);
         }

         if (!$$0.O().b(dge.c)) {
            return;
         }

         dwx $$1 = djo.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayz.a(this.dB() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayz.a(this.dD());
            int $$5 = ayz.a(this.dH() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dW().a_($$6).l() && $$1.a((dgl)this.dW(), $$6)) {
               this.dW().b($$6, $$1);
               this.dW().a(ebt.i, $$6, ebt.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvg $$0, float $$1) {
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.dF() - 1.1F;
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof arc $$6) {
         cwp $$7 = new cwp(cwt.rj);
         cpq.a(new cpv($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dD(), $$4, 1.6F, 12.0F));
      }

      this.a(awa.zv, 1.0F, 0.4F / (this.dZ().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.sS) && this.a()) {
         if (this.dW() instanceof arc $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ebt.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   public void a(arc $$0, awb $$1, cwp $$2) {
      $$0.a(null, this, awa.zw, $$1, 1.0F, 1.0F);
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
      return awa.zs;
   }

   @Nullable
   @Override
   protected avz e(bta $$0) {
      return awa.zu;
   }

   @Nullable
   @Override
   protected avz o_() {
      return awa.zt;
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.75F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
