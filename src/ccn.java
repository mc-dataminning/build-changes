import javax.annotation.Nullable;

public class ccn extends cci {
   private static final cvp cf = cvp.a(crv.pu, crv.rY, crv.rX, crv.vj, crv.vg, crv.vh);
   private static final bqd cg = bqg.t.n().a(0.5F).b(0.2975F);
   public float bX;
   public float bY;
   public float ca;
   public float cb;
   public float cc = 1.0F;
   private float ch = 1.0F;
   public int cd = this.ag.a(6000) + 6000;
   public boolean ce;

   public ccn(bqg<? extends ccn> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new byj(this, 1.4));
      this.bR.a(2, new bxc(this, 1.0));
      this.bR.a(3, new byy(this, 1.0, cf, false));
      this.bR.a(4, new bxp(this, 1.1));
      this.bR.a(5, new bzd(this, 1.0));
      this.bR.a(6, new bxy(this, cka.class, 6.0F));
      this.bR.a(7, new byl(this));
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 4.0).a(bsa.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cb = this.bX;
      this.ca = this.bY;
      this.bY = this.bY + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bY = axm.a(this.bY, 0.0F, 1.0F);
      if (!this.aC() && this.cc < 1.0F) {
         this.cc = 1.0F;
      }

      this.cc *= 0.9F;
      esj $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bX = this.bX + this.cc * 2.0F;
      if (!this.dM().B && this.bA() && !this.p_() && !this.u() && --this.cd <= 0) {
         this.a(auo.eT, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(crv.qQ);
         this.a(dub.t);
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
   protected aun v() {
      return auo.eR;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.eU;
   }

   @Override
   protected aun o_() {
      return auo.eS;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.eV, 0.15F, 1.0F);
   }

   @Nullable
   public ccn b(apu $$0, bpu $$1) {
      return bqg.t.a((czg)$$0);
   }

   @Override
   public boolean o(crs $$0) {
      return cf.a($$0);
   }

   @Override
   public int eg() {
      return this.u() ? 10 : super.eg();
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.ce = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cd = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ce);
      $$0.a("EggLayTime", this.cd);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bqa $$0, bqa.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bqt) {
         ((bqt)$$0).aX = this.aX;
      }
   }

   public boolean u() {
      return this.ce;
   }

   public void w(boolean $$0) {
      this.ce = $$0;
   }
}
