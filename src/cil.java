import javax.annotation.Nullable;

public class cil extends cig {
   private static final bvv bM = bwb.z.n().a(0.5F).b(0.2975F);
   public float bE;
   public float bF;
   public float bG;
   public float bI;
   public float bJ = 1.0F;
   private float bN = 1.0F;
   public int bK = this.ae.a(6000) + 6000;
   public boolean bL;

   public cil(bwb<? extends cil> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ceg(this, 1.4));
      this.bB.a(2, new ccz(this, 1.0));
      this.bB.a(3, new cev(this, 1.0, $$0 -> $$0.a(axi.an), false));
      this.bB.a(4, new cdm(this, 1.1));
      this.bB.a(5, new cfa(this, 1.0));
      this.bB.a(6, new cdv(this, cqi.class, 6.0F));
      this.bB.a(7, new cei(this));
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bM : super.e($$0);
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 4.0).a(bxx.v, 0.25);
   }

   @Override
   public void k_() {
      super.k_();
      this.bI = this.bE;
      this.bG = this.bF;
      this.bF = this.bF + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bF = azk.a(this.bF, 0.0F, 1.0F);
      if (!this.aJ() && this.bJ < 1.0F) {
         this.bJ = 1.0F;
      }

      this.bJ *= 0.9F;
      fcu $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.bE = this.bE + this.bJ * 2.0F;
      if (this.dV() instanceof arn $$1 && this.bK() && !this.n_() && !this.t() && --this.bK <= 0) {
         if (this.a($$1, exh.aI, this::a)) {
            this.a(awk.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(edm.t);
         }

         this.bK = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.bN;
   }

   @Override
   protected void aZ() {
      this.bN = this.Y + this.bF / 2.0F;
   }

   @Override
   protected awj u() {
      return awk.eT;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.eW;
   }

   @Override
   protected awj l_() {
      return awk.eU;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.eX, 0.15F, 1.0F);
   }

   @Nullable
   public cil b(arn $$0, bvi $$1) {
      return bwb.z.a($$0, bwa.e);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.an);
   }

   @Override
   protected int e(arn $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.bL = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bK = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.bL);
      $$0.a("EggLayTime", this.bK);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bvs $$0, bvs.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwr) {
         ((bwr)$$0).aU = this.aU;
      }
   }

   public boolean t() {
      return this.bL;
   }

   public void w(boolean $$0) {
      this.bL = $$0;
   }
}
