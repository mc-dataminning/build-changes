import javax.annotation.Nullable;

public class cac extends bzx {
   private static final csc cb = csc.a(cpg.pu, cpg.rY, cpg.rX, cpg.vh, cpg.ve, cpg.vf);
   private static final bnt cc = bnw.s.n().a(0.5F).b(0.2975F);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cd = 1.0F;
   public int bZ = this.af.a(6000) + 6000;
   public boolean ca;

   public cac(bnw<? extends cac> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bvy(this, 1.4));
      this.bO.a(2, new bur(this, 1.0));
      this.bO.a(3, new bwn(this, 1.0, cb, false));
      this.bO.a(4, new bve(this, 1.1));
      this.bO.a(5, new bws(this, 1.0));
      this.bO.a(6, new bvn(this, chl.class, 6.0F));
      this.bO.a(7, new bwa(this));
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 4.0).a(bpp.o, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = awi.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      enz $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(atl.eL, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpg.qQ);
         this.b(dpw.t);
         this.bZ = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.Z > this.cd;
   }

   @Override
   protected void aS() {
      this.cd = this.Z + this.bU / 2.0F;
   }

   @Override
   protected atk y() {
      return atl.eJ;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.eM;
   }

   @Override
   protected atk n_() {
      return atl.eK;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.eN, 0.15F, 1.0F);
   }

   @Nullable
   public cac b(aow $$0, bnl $$1) {
      return bnw.s.a((cvr)$$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return cb.a($$0);
   }

   @Override
   public int ef() {
      return this.w() ? 10 : super.ef();
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(bnq $$0, bnq.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof boi) {
         ((boi)$$0).aU = this.aU;
      }
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
