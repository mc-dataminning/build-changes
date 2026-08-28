import javax.annotation.Nullable;

public class chx extends chs {
   private static final bvi ch = bvm.z.n().a(0.5F).b(0.2975F);
   public float bZ;
   public float ca;
   public float cb;
   public float cd;
   public float ce = 1.0F;
   private float ci = 1.0F;
   public int cf = this.ae.a(6000) + 6000;
   public boolean cg;

   public chx(bvm<? extends chx> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cds(this, 1.4));
      this.bT.a(2, new ccl(this, 1.0));
      this.bT.a(3, new ceh(this, 1.0, $$0 -> $$0.a(ayd.ap), false));
      this.bT.a(4, new ccy(this, 1.1));
      this.bT.a(5, new cem(this, 1.0));
      this.bT.a(6, new cdh(this, cps.class, 6.0F));
      this.bT.a(7, new cdu(this));
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 4.0).a(bxj.v, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.cd = this.bZ;
      this.cb = this.ca;
      this.ca = this.ca + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.ca = bae.a(this.ca, 0.0F, 1.0F);
      if (!this.aJ() && this.ce < 1.0F) {
         this.ce = 1.0F;
      }

      this.ce *= 0.9F;
      fbs $$0 = this.dy();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bZ = this.bZ + this.ce * 2.0F;
      if (this.dV() instanceof ash $$1 && this.bL() && !this.e_() && !this.t() && --this.cf <= 0) {
         if (this.a($$1, ewd.aI, this::a)) {
            this.a(axf.eU, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecj.t);
         }

         this.cf = this.ae.a(6000) + 6000;
      }
   }

   @Override
   protected boolean ba() {
      return this.Y > this.ci;
   }

   @Override
   protected void aZ() {
      this.ci = this.Y + this.ca / 2.0F;
   }

   @Override
   protected axe u() {
      return axf.eS;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.eV;
   }

   @Override
   protected axe o_() {
      return axf.eT;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.eW, 0.15F, 1.0F);
   }

   @Nullable
   public chx b(ash $$0, buw $$1) {
      return bvm.z.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ap);
   }

   @Override
   protected int e(ash $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.cg = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cf = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cg);
      $$0.a("EggLayTime", this.cf);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bvf $$0, bvf.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwb) {
         ((bwb)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cg;
   }

   public void x(boolean $$0) {
      this.cg = $$0;
   }
}
