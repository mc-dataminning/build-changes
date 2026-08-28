import javax.annotation.Nullable;

public class cgi extends cgd {
   private static final btu cg = bty.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.af.a(6000) + 6000;
   public boolean cf;

   public cgi(bty<? extends cgi> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ccd(this, 1.4));
      this.bS.a(2, new caw(this, 1.0));
      this.bS.a(3, new ccs(this, 1.0, $$0 -> $$0.a(axe.ak), false));
      this.bS.a(4, new cbj(this, 1.1));
      this.bS.a(5, new ccx(this, 1.0));
      this.bS.a(6, new cbs(this, cnx.class, 6.0F));
      this.bS.a(7, new ccf(this));
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 4.0).a(bvu.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aH() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azf.a(this.bZ, 0.0F, 1.0F);
      if (!this.aH() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      eyw $$0 = this.dv();
      if (!this.aH() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dS().B && this.bI() && !this.p_() && !this.t() && --this.ce <= 0) {
         this.a(awg.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cvw.qS);
         this.a(dzp.t);
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
   protected awf w() {
      return awg.eS;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.eV;
   }

   @Override
   protected awf o_() {
      return awg.eT;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cgi b(arj $$0, btk $$1) {
      return bty.t.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.ak);
   }

   @Override
   protected int el() {
      return this.t() ? 10 : super.el();
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(btr $$0, btr.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bun) {
         ((bun)$$0).aT = this.aT;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
