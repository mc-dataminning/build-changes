import javax.annotation.Nullable;

public class cci extends ccd {
   private static final cvg cf = cvg.a(crm.pu, crm.rY, crm.rX, crm.vj, crm.vg, crm.vh);
   private static final bpy cg = bqb.t.n().a(0.5F).b(0.2975F);
   public float bX;
   public float bY;
   public float ca;
   public float cb;
   public float cc = 1.0F;
   private float ch = 1.0F;
   public int cd = this.ag.a(6000) + 6000;
   public boolean ce;

   public cci(bqb<? extends cci> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new bye(this, 1.4));
      this.bR.a(2, new bwx(this, 1.0));
      this.bR.a(3, new byt(this, 1.0, cf, false));
      this.bR.a(4, new bxk(this, 1.1));
      this.bR.a(5, new byy(this, 1.0));
      this.bR.a(6, new bxt(this, cjt.class, 6.0F));
      this.bR.a(7, new byg(this));
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 4.0).a(brv.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cb = this.bX;
      this.ca = this.bY;
      this.bY = this.bY + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bY = axk.a(this.bY, 0.0F, 1.0F);
      if (!this.aC() && this.cc < 1.0F) {
         this.cc = 1.0F;
      }

      this.cc *= 0.9F;
      esa $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bX = this.bX + this.cc * 2.0F;
      if (!this.dM().B && this.bA() && !this.p_() && !this.u() && --this.cd <= 0) {
         this.a(aum.eT, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(crm.qQ);
         this.a(dts.t);
         this.cd = this.ag.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ch;
   }

   @Override
   protected void aS() {
      this.ch = this.aa + this.bY / 2.0F;
   }

   @Override
   protected aul v() {
      return aum.eR;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.eU;
   }

   @Override
   protected aul o_() {
      return aum.eS;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cci b(aps $$0, bpp $$1) {
      return bqb.t.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return cf.a($$0);
   }

   @Override
   public int eg() {
      return this.u() ? 10 : super.eg();
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.ce = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cd = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ce);
      $$0.a("EggLayTime", this.cd);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bpv $$0, bpv.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bqo) {
         ((bqo)$$0).aX = this.aX;
      }
   }

   public boolean u() {
      return this.ce;
   }

   public void w(boolean $$0) {
      this.ce = $$0;
   }
}
