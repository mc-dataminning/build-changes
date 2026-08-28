import javax.annotation.Nullable;

public class cga extends cfv {
   private static final btm ch = btq.t.n().a(0.5F).b(0.2975F);
   public float bZ;
   public float ca;
   public float cb;
   public float cd;
   public float ce = 1.0F;
   private float ci = 1.0F;
   public int cf = this.af.a(6000) + 6000;
   public boolean cg;

   public cga(btq<? extends cga> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cbv(this, 1.4));
      this.bT.a(2, new cao(this, 1.0));
      this.bT.a(3, new cck(this, 1.0, $$0 -> $$0.a(axb.ak), false));
      this.bT.a(4, new cbb(this, 1.1));
      this.bT.a(5, new ccp(this, 1.0));
      this.bT.a(6, new cbk(this, cnp.class, 6.0F));
      this.bT.a(7, new cbx(this));
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? ch : super.e($$0);
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 4.0).a(bvm.v, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.cd = this.bZ;
      this.cb = this.ca;
      this.ca = this.ca + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.ca = azc.a(this.ca, 0.0F, 1.0F);
      if (!this.aH() && this.ce < 1.0F) {
         this.ce = 1.0F;
      }

      this.ce *= 0.9F;
      eye $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bZ = this.bZ + this.ce * 2.0F;
      if (!this.dS().B && this.bI() && !this.o_() && !this.t() && --this.cf <= 0) {
         this.a(awd.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvo.qS);
         this.a(dyx.t);
         this.cf = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aZ() {
      return this.Z > this.ci;
   }

   @Override
   protected void aY() {
      this.ci = this.Z + this.ca / 2.0F;
   }

   @Override
   protected awc w() {
      return awd.eS;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.eV;
   }

   @Override
   protected awc n_() {
      return awd.eT;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cga b(arg $$0, btc $$1) {
      return btq.t.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.ak);
   }

   @Override
   protected int ek() {
      return this.t() ? 10 : super.ek();
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cg = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cf = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cg);
      $$0.a("EggLayTime", this.cf);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(btj $$0, btj.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buf) {
         ((buf)$$0).aU = this.aU;
      }
   }

   public boolean t() {
      return this.cg;
   }

   public void x(boolean $$0) {
      this.cg = $$0;
   }
}
