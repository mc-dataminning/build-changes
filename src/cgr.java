import javax.annotation.Nullable;

public class cgr extends cgm {
   private static final buc cg = bug.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float ca;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.af.a(6000) + 6000;
   public boolean cf;

   public cgr(bug<? extends cgr> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.j, 0.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccm(this, 1.4));
      this.bS.a(2, new cbf(this, 1.0));
      this.bS.a(3, new cdb(this, 1.0, $$0 -> $$0.a(axi.al), false));
      this.bS.a(4, new cbs(this, 1.1));
      this.bS.a(5, new cdg(this, 1.0));
      this.bS.a(6, new ccb(this, coh.class, 6.0F));
      this.bS.a(7, new cco(this));
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 4.0).a(bwd.v, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.ca = this.bZ;
      this.bZ = this.bZ + (this.aJ() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = azj.a(this.bZ, 0.0F, 1.0F);
      if (!this.aJ() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      ezh $$0 = this.dA();
      if (!this.aJ() && $$0.e < 0.0) {
         this.h($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dX().C && this.bM() && !this.p_() && !this.t() && --this.ce <= 0) {
         this.a(awk.eU, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cwb.qS);
         this.a(eaa.t);
         this.ce = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean bb() {
      return this.Z > this.ch;
   }

   @Override
   protected void ba() {
      this.ch = this.Z + this.bZ / 2.0F;
   }

   @Override
   protected awj w() {
      return awk.eS;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.eV;
   }

   @Override
   protected awj o_() {
      return awk.eT;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.eW, 0.15F, 1.0F);
   }

   @Nullable
   public cgr b(arm $$0, btq $$1) {
      return bug.t.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.al);
   }

   @Override
   protected int eq() {
      return this.t() ? 10 : super.eq();
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(btz $$0, btz.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof buv) {
         ((buv)$$0).aU = this.aU;
      }
   }

   public boolean t() {
      return this.cf;
   }

   public void x(boolean $$0) {
      this.cf = $$0;
   }
}
