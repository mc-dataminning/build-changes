import javax.annotation.Nullable;

public class cht extends cgs implements bvv, clz {
   private static final ako<Byte> b = aks.a(cht.class, akq.a);
   private static final byte c = 16;

   public cht(bup<? extends cht> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cdb(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdp(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cck(this, cor.class, 6.0F));
      this.bS.a(4, new ccx(this));
      this.bT.a(1, new cdv<>(this, bvg.class, 10, true, false, $$0 -> $$0 instanceof cln));
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 4.0).a(bwm.v, 0.2F);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fu() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dY().C) {
         if (this.dY().t(this.dy()).a(axc.ae)) {
            this.a(this.dZ().d(), 1.0F);
         }

         if (!this.dY().ac().b(dfb.c)) {
            return;
         }

         dvo $$0 = dil.dN.m();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azn.a(this.dD() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azn.a(this.dF());
            int $$4 = azn.a(this.dJ() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jh $$5 = new jh($$2, $$3, $$4);
            if (this.dY().a_($$5).l() && $$0.a((dfi)this.dY(), $$5)) {
               this.dY().b($$5, $$0);
               this.dY().a(eak.i, $$5, eak.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bve $$0, float $$1) {
      double $$2 = $$0.dD() - this.dD();
      double $$3 = $$0.dH() - 1.1F;
      double $$4 = $$0.dJ() - this.dJ();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dY() instanceof arq $$6) {
         cwf $$7 = new cwf(cwj.qD);
         cpk.a(new cpp($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dF(), $$4, 1.6F, 12.0F));
      }

      this.a(awo.yK, 1.0F, 0.4F / (this.eb().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.sm) && this.a()) {
         this.a(awp.h, $$2);
         this.a(eak.M, $$0);
         if (!this.dY().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   public void a(awp $$0, cwf $$1) {
      this.dY().a(null, this, awo.yL, $$0, 1.0F, 1.0F);
      if (!this.dY().y_()) {
         this.x(false);
         this.a(euc.aU, $$1, $$0x -> this.a($$0x, this.cU()));
      }
   }

   @Override
   public boolean a() {
      return this.bN() && this.t();
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
   protected awn w() {
      return awo.yH;
   }

   @Nullable
   @Override
   protected awn d(bsy $$0) {
      return awo.yJ;
   }

   @Nullable
   @Override
   protected awn o_() {
      return awo.yI;
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.75F * this.cU()), (double)(this.dt() * 0.4F));
   }
}
