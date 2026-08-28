import javax.annotation.Nullable;

public class chu extends chp {
   private static final bvd bN = bvi.z.n().a(0.5F).b(0.2975F);
   public float bF;
   public float bG;
   public float bH;
   public float bJ;
   public float bK = 1.0F;
   private float bO = 1.0F;
   public int bL = this.ae.a(6000) + 6000;
   public boolean bM;

   public chu(bvi<? extends chu> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cdp(this, 1.4));
      this.bC.a(2, new cci(this, 1.0));
      this.bC.a(3, new cee(this, 1.0, $$0 -> $$0.a(awy.an), false));
      this.bC.a(4, new ccv(this, 1.1));
      this.bC.a(5, new cej(this, 1.0));
      this.bC.a(6, new cde(this, cpr.class, 6.0F));
      this.bC.a(7, new cdr(this));
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 4.0).a(bxg.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bJ = this.bF;
      this.bH = this.bG;
      this.bG = this.bG + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bG = ayz.a(this.bG, 0.0F, 1.0F);
      if (!this.aJ() && this.bK < 1.0F) {
         this.bK = 1.0F;
      }

      this.bK *= 0.9F;
      fbx $$0 = this.dx();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bF = this.bF + this.bK * 2.0F;
      if (this.dU() instanceof ard $$1 && this.bJ() && !this.n_() && !this.t() && --this.bL <= 0) {
         if (this.a($$1, ewk.aI, this::a)) {
            this.a(awa.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecp.t);
         }

         this.bL = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bO;
   }

   @Override
   protected void aZ() {
      this.bO = this.Y + this.bG / 2.0F;
   }

   @Override
   protected avz u() {
      return awa.eT;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.eW;
   }

   @Override
   protected avz l_() {
      return awa.eU;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.eX, 0.15F, 1.0F);
   }

   @Nullable
   public chu b(ard $$0, buq $$1) {
      return bvi.z.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.an);
   }

   @Override
   protected int e(ard $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bM = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bL = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bM);
      $$0.a("EggLayTime", this.bL);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bva $$0, bva.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bvy) {
         ((bvy)$$0).aV = this.aV;
      }
   }

   public boolean t() {
      return this.bM;
   }

   public void w(boolean $$0) {
      this.bM = $$0;
   }
}
