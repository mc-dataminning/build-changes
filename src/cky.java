import javax.annotation.Nullable;

public class cky extends cjs implements byv, cpo {
   private static final aku<Byte> a = aky.a(cky.class, akw.a);
   private static final byte b = 16;
   private static final boolean c = true;

   public cky(bxn<? extends cky> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void C() {
      this.bF.a(1, new cga(this, 1.25, 20, 10.0F));
      this.bF.a(2, new cgo(this, 1.0, 1.0000001E-5F));
      this.bF.a(3, new cfj(this, csi.class, 6.0F));
      this.bF.a(4, new cfw(this));
      this.bG.a(1, new cgu<>(this, byh.class, 10, true, false, ($$0, $$1) -> $$0 instanceof cpc));
   }

   public static bzk.a m() {
      return byh.D().a(bzl.s, 4.0).a(bzl.v, 0.2F);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)16);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.p());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Pumpkin", true));
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dV() instanceof asb $$0) {
         if (this.dV().u(this.dv()).a(axm.ae)) {
            this.a($$0, this.dW().d(), 1.0F);
         }

         if (!$$0.O().c(dkf.d)) {
            return;
         }

         ebq $$1 = dnq.ed.m();

         for (int $$2 = 0; $$2 < 4; $$2++) {
            int $$3 = azz.a(this.dA() + (double)((float)($$2 % 2 * 2 - 1) * 0.25F));
            int $$4 = azz.a(this.dC());
            int $$5 = azz.a(this.dG() + (double)((float)($$2 / 2 % 2 * 2 - 1) * 0.25F));
            iw $$6 = new iw($$3, $$4, $$5);
            if (this.dV().a_($$6).l() && $$1.a((dkm)this.dV(), $$6)) {
               this.dV().b($$6, $$1);
               this.dV().a(egq.i, $$6, egq.a.a(this, $$1));
            }
         }
      }
   }

   @Override
   public void a(byf $$0, float $$1) {
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.dE() - 1.1F;
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof asb $$6) {
         dak $$7 = new dak(dao.rs);
         ctd.a(new cti($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dC(), $$4, 1.6F, 12.0F));
      }

      this.a(awy.zK, 1.0F, 0.4F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.td) && this.a()) {
         if (this.dV() instanceof asb $$3) {
            this.a($$3, awz.h, $$2);
            this.a(egq.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   public void a(asb $$0, awz $$1, dak $$2) {
      $$0.a(null, this, awy.zL, $$1, 1.0F, 1.0F);
      this.w(false);
      this.a($$0, fap.aU, $$2, ($$0x, $$1x) -> this.a($$0x, $$1x, this.cS()));
   }

   @Override
   public boolean a() {
      return this.bJ() && this.p();
   }

   public boolean p() {
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
   protected awx s() {
      return awy.zH;
   }

   @Nullable
   @Override
   protected awx e(bvt $$0) {
      return awy.zJ;
   }

   @Nullable
   @Override
   protected awx j_() {
      return awy.zI;
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.75F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
