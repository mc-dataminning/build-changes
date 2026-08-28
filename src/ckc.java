import javax.annotation.Nullable;

public class ckc extends ciw implements bxz, cos {
   private static final akj<Byte> a = akn.a(ckc.class, akl.a);
   private static final byte b = 16;

   public ckc(bwr<? extends ckc> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cfe(this, 1.25, 20, 10.0F));
      this.bD.a(2, new cfs(this, 1.0, 1.0000001E-5F));
      this.bD.a(3, new cen(this, crm.class, 6.0F));
      this.bD.a(4, new cfa(this));
      this.bE.a(1, new cfy<>(this, bxl.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cof));
   }

   public static byo.a j() {
      return bxl.E().a(byp.s, 4.0).a(byp.v, 0.2F);
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
      if ($$0.c("Pumpkin")) {
         this.w($$0.o("Pumpkin"));
      }
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public void k_() {
      super.k_();
      if (this.dU() instanceof arq $$0) {
         if (this.dU().u(this.du()).a(axb.ae)) {
            this.a($$0, this.dV().d(), 1.0F);
         }

         if (!$$0.O().c(dji.d)) {
            return;
         }

         eat $$1 = dmt.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azm.a(this.dz() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azm.a(this.dB());
            int $$5 = azm.a(this.dF() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iv $$6 = new iv($$3, $$4, $$5);
            if (this.dU().a_($$6).l() && $$1.a((djp)this.dU(), $$6)) {
               this.dU().b($$6, $$1);
               this.dU().a(eft.i, $$6, eft.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(bxj $$0, float $$1) {
      double $$2 = $$0.dz() - this.dz();
      double $$3 = $$0.dD() - 1.1F;
      double $$4 = $$0.dF() - this.dF();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dU() instanceof arq $$6) {
         czn $$7 = new czn(czr.rs);
         csh.a(new csm($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dB(), $$4, 1.6F, 12.0F));
      }

      this.a(awn.zK, 1.0F, 0.4F / (this.dX().i() * 0.4F + 0.8F));
   }

   @Override
   protected bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(czr.td) && this.a()) {
         if (this.dU() instanceof arq $$3) {
            this.a($$3, awo.h, $$2);
            this.a(eft.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   public void a(arq $$0, awo $$1, czn $$2) {
      $$0.a(null, this, awn.zL, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, ezp.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cR()));
   }

   @Override
   public boolean a() {
      return this.bI() && this.m();
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
      return awn.zH;
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.zJ;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.zI;
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, (double)(0.75F * this.cR()), (double)(this.dp() * 0.4F));
   }
}
