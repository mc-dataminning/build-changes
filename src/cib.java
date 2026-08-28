import javax.annotation.Nullable;

public class cib extends chw {
   private static final bvm ch = bvq.z.n().a(0.5F).b(0.2975F);
   public float bZ;
   public float ca;
   public float cb;
   public float cd;
   public float ce = 1.0F;
   private float ci = 1.0F;
   public int cf = this.ae.a(6000) + 6000;
   public boolean cg;

   public cib(bvq<? extends cib> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cdw(this, 1.4));
      this.bT.a(2, new ccp(this, 1.0));
      this.bT.a(3, new cel(this, 1.0, $$0 -> $$0.a(ayd.ap), false));
      this.bT.a(4, new cdc(this, 1.1));
      this.bT.a(5, new ceq(this, 1.0));
      this.bT.a(6, new cdl(this, cpw.class, 6.0F));
      this.bT.a(7, new cdy(this));
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? ch : super.e($$0);
   }

   public static bxm.a p() {
      return chw.gt().a(bxn.s, 4.0).a(bxn.v, 0.25);
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
      fbx $$0 = this.dz();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bZ = this.bZ + this.ce * 2.0F;
      if (this.dW() instanceof ash $$1 && this.bL() && !this.e_() && !this.t() && --this.cf <= 0) {
         if (this.a($$1, ewk.aI, this::a)) {
            this.a(axf.eV, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            this.a(ecq.t);
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
      return axf.eT;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.eW;
   }

   @Override
   protected axe o_() {
      return axf.eU;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.eX, 0.15F, 1.0F);
   }

   @Nullable
   public cib b(ash $$0, bva $$1) {
      return bvq.z.a($$0, bvp.e);
   }

   @Override
   public boolean j(cxo $$0) {
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
   protected void a(bvj $$0, bvj.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bwf) {
         ((bwf)$$0).aX = this.aX;
      }
   }

   public boolean t() {
      return this.cg;
   }

   public void x(boolean $$0) {
      this.cg = $$0;
   }
}
