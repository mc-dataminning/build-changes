import javax.annotation.Nullable;

public class ciy extends cis {
   private static final bwg bN = bwm.z.n().a(0.5F).b(0.2975F);
   public float bF;
   public float bG;
   public float bH;
   public float bJ;
   public float bK = 1.0F;
   private float bO = 1.0F;
   public int bL = this.ae.a(6000) + 6000;
   public boolean bM;

   public ciy(bwm<? extends ciy> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cer(this, 1.4));
      this.bC.a(2, new cdk(this, 1.0));
      this.bC.a(3, new cfg(this, 1.0, $$0 -> $$0.a(axk.an), false));
      this.bC.a(4, new cdx(this, 1.1));
      this.bC.a(5, new cfl(this, 1.0));
      this.bC.a(6, new ceg(this, cqy.class, 6.0F));
      this.bC.a(7, new cet(this));
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 4.0).a(byi.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bJ = this.bF;
      this.bH = this.bG;
      this.bG = this.bG + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bG = azm.a(this.bG, 0.0F, 1.0F);
      if (!this.aJ() && this.bK < 1.0F) {
         this.bK = 1.0F;
      }

      this.bK *= 0.9F;
      fei $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bF = this.bF + this.bK * 2.0F;
      if (this.dV() instanceof arq $$1 && this.bK() && !this.n_() && !this.t() && --this.bL <= 0) {
         if (this.a($$1, eyv.aI, this::a)) {
            this.a(awn.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eez.t);
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
   protected awm u() {
      return awn.eT;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.eW;
   }

   @Override
   protected awm l_() {
      return awn.eU;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.eX, 0.15F, 1.0F);
   }

   @Nullable
   public ciy b(arq $$0, bvt $$1) {
      return bwm.z.a($$0, bwl.e);
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.an);
   }

   @Override
   protected int e(arq $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bM = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bL = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bM);
      $$0.a("EggLayTime", this.bL);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bwd $$0, bwd.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bxc) {
         ((bxc)$$0).aV = this.aV;
      }
   }

   public boolean t() {
      return this.bM;
   }

   public void w(boolean $$0) {
      this.bM = $$0;
   }
}
