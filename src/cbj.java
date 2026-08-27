import javax.annotation.Nullable;

public class cbj extends cbe {
   private static final ctm cf = ctm.a(cqp.pu, cqp.rY, cqp.rX, cqp.vj, cqp.vg, cqp.vh);
   private static final bpa cg = bpd.u.n().a(0.5F).b(0.2975F);
   public float bX;
   public float bY;
   public float ca;
   public float cb;
   public float cc = 1.0F;
   private float ch = 1.0F;
   public int cd = this.ag.a(6000) + 6000;
   public boolean ce;

   public cbj(bpd<? extends cbj> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new bxf(this, 1.4));
      this.bR.a(2, new bvy(this, 1.0));
      this.bR.a(3, new bxu(this, 1.0, cf, false));
      this.bR.a(4, new bwl(this, 1.1));
      this.bR.a(5, new bxz(this, 1.0));
      this.bR.a(6, new bwu(this, ciu.class, 6.0F));
      this.bR.a(7, new bxh(this));
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? cg : super.e($$0);
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 4.0).a(bqw.r, 0.25);
   }

   @Override
   public void m_() {
      super.m_();
      this.cb = this.bX;
      this.ca = this.bY;
      this.bY = this.bY + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bY = aww.a(this.bY, 0.0F, 1.0F);
      if (!this.aC() && this.cc < 1.0F) {
         this.cc = 1.0F;
      }

      this.cc *= 0.9F;
      ept $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bX = this.bX + this.cc * 2.0F;
      if (!this.dM().B && this.bA() && !this.o_() && !this.s() && --this.cd <= 0) {
         this.a(aty.eS, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cqp.qQ);
         this.b(drp.t);
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
   protected atx v() {
      return aty.eQ;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.eT;
   }

   @Override
   protected atx n_() {
      return aty.eR;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.eU, 0.15F, 1.0F);
   }

   @Nullable
   public cbj b(apf $$0, bos $$1) {
      return bpd.u.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return cf.a($$0);
   }

   @Override
   public int eg() {
      return this.s() ? 10 : super.eg();
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.ce = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cd = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ce);
      $$0.a("EggLayTime", this.cd);
   }

   @Override
   public boolean h(double $$0) {
      return this.s();
   }

   @Override
   protected void a(box $$0, box.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bpp) {
         ((bpp)$$0).aX = this.aX;
      }
   }

   public boolean s() {
      return this.ce;
   }

   public void w(boolean $$0) {
      this.ce = $$0;
   }
}
