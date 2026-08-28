import javax.annotation.Nullable;

public class cgf extends cga {
   private static final btr cg = btv.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.af.a(6000) + 6000;
   public boolean cf;

   public cgf(btv<? extends cgf> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cca(this, 1.4));
      this.bS.a(2, new cat(this, 1.0));
      this.bS.a(3, new ccp(this, 1.0, $$0 -> $$0.a(axc.ak), false));
      this.bS.a(4, new cbg(this, 1.1));
      this.bS.a(5, new ccu(this, 1.0));
      this.bS.a(6, new cbp(this, cnu.class, 6.0F));
      this.bS.a(7, new ccc(this));
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? cg : super.e($$0);
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 4.0).a(bvr.v, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azd.a(this.bZ, 0.0F, 1.0F);
      if (!this.aH() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      eys $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dS().B && this.bI() && !this.o_() && !this.t() && --this.ce <= 0) {
         this.a(awe.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvt.qS);
         this.a(dzl.t);
         this.ce = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aZ() {
      return this.Z > this.ch;
   }

   @Override
   protected void aY() {
      this.ch = this.Z + this.bZ / 2.0F;
   }

   @Override
   protected awd w() {
      return awe.eS;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.eV;
   }

   @Override
   protected awd n_() {
      return awe.eT;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cgf b(arh $$0, bth $$1) {
      return btv.t.a($$0, btu.e);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ak);
   }

   @Override
   protected int ek() {
      return this.t() ? 10 : super.ek();
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bto $$0, bto.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buk) {
         ((buk)$$0).aT = this.aT;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
