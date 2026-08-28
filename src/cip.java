import javax.annotation.Nullable;

public class cip extends chm implements bwp, cmw {
   private static final ajx<Byte> a = akb.a(cip.class, ajz.a);
   private static final byte b = 16;

   public cip(bvi<? extends cip> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdv(this, 1.25, 20, 10.0F));
      this.bC.a(2, new cej(this, 1.0, 1.0000001E-5F));
      this.bC.a(3, new cde(this, cpr.class, 6.0F));
      this.bC.a(4, new cdr(this));
      this.bD.a(1, new cep<>(this, bwa.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cmk));
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 4.0).a(bxg.v, 0.2F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.m());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dU() instanceof ard $$0) {
         if (this.dU().t(this.du()).a(awo.ae)) {
            this.a($$0, this.dV().d(), 1.0F);
         }

         if (!$$0.O().b(dgv.c)) {
            return;
         }

         dxq $$1 = dkg.ea.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = ayz.a(this.dz() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = ayz.a(this.dB());
            int $$5 = ayz.a(this.dF() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            ji $$6 = new ji($$3, $$4, $$5);
            if (this.dU().a_($$6).l() && $$1.a((dhc)this.dU(), $$6)) {
               this.dU().b($$6, $$1);
               this.dU().a(ecp.i, $$6, ecp.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bvy $$0, float $$1) {
      double $$2 = $$0.dz() - this.dz();
      double $$3 = $$0.dD() - 1.1F;
      double $$4 = $$0.dF() - this.dF();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dU() instanceof ard $$6) {
         cxh $$7 = new cxh(cxl.rl);
         cqk.a(new cqp($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dB(), $$4, 1.6F, 12.0F));
      }

      this.a(awa.zE, 1.0F, 0.4F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   protected bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.sU) && this.a()) {
         if (this.dU() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ecp.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cxh $$2) {
      $$0.a(null, this, awa.zF, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, ewk.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cR()));
   }

   @Override
   public boolean a() {
      return this.bJ() && this.m();
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
   protected avz u() {
      return awa.zB;
   }

   @Nullable
   @Override
   protected avz e(btp $$0) {
      return awa.zD;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.zC;
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.75F * this.cR()), (double)(this.dp() * 0.4F));
   }
}
