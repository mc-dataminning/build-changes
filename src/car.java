import javax.annotation.Nullable;

public class car extends cam {
   private static final csp cd = csp.a(cpt.pu, cpt.rY, cpt.rX, cpt.vh, cpt.ve, cpt.vf);
   private static final boi ce = bol.s.n().a(0.5F).b(0.2975F);
   public float bV;
   public float bW;
   public float bY;
   public float bZ;
   public float ca = 1.0F;
   private float cf = 1.0F;
   public int cb = this.af.a(6000) + 6000;
   public boolean cc;

   public car(bol<? extends car> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwn(this, 1.4));
      this.bP.a(2, new bvg(this, 1.0));
      this.bP.a(3, new bxc(this, 1.0, cd, false));
      this.bP.a(4, new bvt(this, 1.1));
      this.bP.a(5, new bxh(this, 1.0));
      this.bP.a(6, new bwc(this, cia.class, 6.0F));
      this.bP.a(7, new bwp(this));
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   public static bqd.a u() {
      return boz.C().a(bqe.n, 4.0).a(bqe.o, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bZ = this.bV;
      this.bY = this.bW;
      this.bW = this.bW + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bW = awm.a(this.bW, 0.0F, 1.0F);
      if (!this.aC() && this.ca < 1.0F) {
         this.ca = 1.0F;
      }

      this.ca *= 0.9F;
      eov $$0 = this.dm();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bV = this.bV + this.ca * 2.0F;
      if (!this.dJ().B && this.bx() && !this.o_() && !this.w() && --this.cb <= 0) {
         this.a(atp.eL, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpt.qQ);
         this.b(dqr.t);
         this.cb = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.Z > this.cf;
   }

   @Override
   protected void aS() {
      this.cf = this.Z + this.bW / 2.0F;
   }

   @Override
   protected ato y() {
      return atp.eJ;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.eM;
   }

   @Override
   protected ato n_() {
      return atp.eK;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.eN, 0.15F, 1.0F);
   }

   @Nullable
   public car b(apa $$0, boa $$1) {
      return bol.s.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return cd.a($$0);
   }

   @Override
   public int ed() {
      return this.w() ? 10 : super.ed();
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.cc = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.cb = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cc);
      $$0.a("EggLayTime", this.cb);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(bof $$0, bof.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof box) {
         ((box)$$0).aV = this.aV;
      }
   }

   public boolean w() {
      return this.cc;
   }

   public void w(boolean $$0) {
      this.cc = $$0;
   }
}
