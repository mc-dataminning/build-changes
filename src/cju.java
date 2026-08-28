import javax.annotation.Nullable;

public class cju extends cip implements bxs, cod {
   private static final akj<Byte> a = akn.a(cju.class, akl.a);
   private static final byte b = 16;

   public cju(bwm<? extends cju> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cex(this, 1.25, 20, 10.0F));
      this.bC.a(2, new cfl(this, 1.0, 1.0000001E-5F));
      this.bC.a(3, new ceg(this, cqy.class, 6.0F));
      this.bC.a(4, new cet(this));
      this.bD.a(1, new cfr<>(this, bxe.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cnr));
   }

   public static byh.a j() {
      return bxe.E().a(byi.s, 4.0).a(byi.v, 0.2F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dV() instanceof arq $$0) {
         if (this.dV().u(this.dv()).a(axb.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(dir.c)) {
            return;
         }

         dzz $$1 = dmc.eb.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azm.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azm.a(this.dC());
            int $$5 = azm.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iu $$6 = new iu($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((diy)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(eez.i, $$6, eez.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bxc $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arq $$6) {
         cyy $$7 = new cyy(czc.rp);
         crs.a(new crx($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awn.zH, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.sY) && this.a()) {
         if (this.dV() instanceof arq $$3) {
            this.a($$3, awo.h, $$2);
            this.a(eez.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   public void a(arq $$0, awo $$1, cyy $$2) {
      $$0.a(null, this, awn.zI, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, eyv.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bK() && this.m();
   }

   public boolean m() {
      return (this.al.a(a) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         this.al.a(a, (byte)($$1 | 16));
      } else {
         this.al.a(a, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awm u() {
      return awn.zE;
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return awn.zG;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.zF;
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
