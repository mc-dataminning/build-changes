import javax.annotation.Nullable;

public class ciu extends cio {
   private static final bwd bN = bwj.z.n().a(0.5F).b(0.2975F);
   public float bF;
   public float bG;
   public float bH;
   public float bJ;
   public float bK = 1.0F;
   private float bO = 1.0F;
   public int bL = this.ae.a(6000) + 6000;
   public boolean bM;

   public ciu(bwj<? extends ciu> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new ceo(this, 1.4));
      this.bC.a(2, new cdh(this, 1.0));
      this.bC.a(3, new cfd(this, 1.0, $$0 -> $$0.a(axi.an), false));
      this.bC.a(4, new cdu(this, 1.1));
      this.bC.a(5, new cfi(this, 1.0));
      this.bC.a(6, new ced(this, cqs.class, 6.0F));
      this.bC.a(7, new ceq(this));
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bN : super.e($$0);
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 4.0).a(byf.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bJ = this.bF;
      this.bH = this.bG;
      this.bG = this.bG + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bG = azk.a(this.bG, 0.0F, 1.0F);
      if (!this.aJ() && this.bK < 1.0F) {
         this.bK = 1.0F;
      }

      this.bK *= 0.9F;
      fdw $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bF = this.bF + this.bK * 2.0F;
      if (this.dV() instanceof aro $$1 && this.bK() && !this.n_() && !this.t() && --this.bL <= 0) {
         if (this.a($$1, eyj.aI, this::a)) {
            this.a(awl.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(eeo.t);
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
   protected awk u() {
      return awl.eT;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.eW;
   }

   @Override
   protected awk l_() {
      return awl.eU;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.eX, 0.15F, 1.0F);
   }

   @Nullable
   public ciu b(aro $$0, bvq $$1) {
      return bwj.z.a($$0, bwi.e);
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.an);
   }

   @Override
   protected int e(aro $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.bM = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bL = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bM);
      $$0.a("EggLayTime", this.bL);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bwa $$0, bwa.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwz) {
         ((bwz)$$0).aV = this.aV;
      }
   }

   public boolean t() {
      return this.bM;
   }

   public void w(boolean $$0) {
      this.bM = $$0;
   }
}
