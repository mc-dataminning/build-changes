import javax.annotation.Nullable;

public class chp extends cgo implements bvr, clv {
   private static final akl<Byte> b = akp.a(chp.class, akn.a);
   private static final byte c = 16;

   public chp(bul<? extends chp> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccx(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdl(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccg(this, com.class, 6.0F));
      this.bS.a(4, new cct(this));
      this.bT.a(1, new cdr<>(this, bvc.class, 10, true, false, $$0 -> $$0 instanceof clj));
   }

   public static bwh.a q() {
      return bvc.E().a(bwi.s, 4.0).a(bwi.v, 0.2F);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         if (this.dX().t(this.dx()).a(awz.ae)) {
            this.a(this.dY().d(), 1.0F);
         }

         if (!this.dX().ac().b(dex.c)) {
            return;
         }

         dvj $$0 = dig.dN.m();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azk.a(this.dC() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azk.a(this.dE());
            int $$4 = azk.a(this.dI() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jh $$5 = new jh($$2, $$3, $$4);
            if (this.dX().a_($$5).l() && $$0.a((dfe)this.dX(), $$5)) {
               this.dX().b($$5, $$0);
               this.dX().a(eag.i, $$5, eag.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bva $$0, float $$1) {
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.dG() - 1.1F;
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dX() instanceof arn $$6) {
         cwb $$7 = new cwb(cwf.qD);
         cpg.a(new cpl($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dE(), $$4, 1.6F, 12.0F));
      }

      this.a(awl.yK, 1.0F, 0.4F / (this.ea().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.rW) && this.a()) {
         this.a(awm.h, $$2);
         this.a(eag.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   public void a(awm $$0, cwb $$1) {
      this.dX().a(null, this, awl.yL, $$0, 1.0F, 1.0F);
      if (!this.dX().y_()) {
         this.x(false);
         this.a(ety.aU, $$1, $$0x -> this.a($$0x, this.cT()));
      }
   }

   @Override
   public boolean a() {
      return this.bM() && this.t();
   }

   public boolean t() {
      return (this.am.a(b) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         this.am.a(b, (byte)($$1 | 16));
      } else {
         this.am.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awk w() {
      return awl.yH;
   }

   @Nullable
   @Override
   protected awk d(bsu $$0) {
      return awl.yJ;
   }

   @Nullable
   @Override
   protected awk o_() {
      return awl.yI;
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.75F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
