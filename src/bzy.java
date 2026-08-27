import javax.annotation.Nullable;

public class bzy extends bzt {
   private static final cry cb = cry.a(cpc.pu, cpc.rY, cpc.rX, cpc.vh, cpc.ve, cpc.vf);
   private static final bnr cc = bnu.s.n().a(0.5F).b(0.2975F);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cd = 1.0F;
   public int bZ = this.af.a(6000) + 6000;
   public boolean ca;

   public bzy(bnu<? extends bzy> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bvu(this, 1.4));
      this.bO.a(2, new bun(this, 1.0));
      this.bO.a(3, new bwj(this, 1.0, cb, false));
      this.bO.a(4, new bva(this, 1.1));
      this.bO.a(5, new bwo(this, 1.0));
      this.bO.a(6, new bvj(this, chh.class, 6.0F));
      this.bO.a(7, new bvw(this));
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 4.0).a(bpl.o, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = awh.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ens $$0 = this.dp();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dM().B && this.bx() && !this.o_() && !this.w() && --this.bZ <= 0) {
         this.a(atk.eK, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cpc.qQ);
         this.b(dpp.t);
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
   protected atj y() {
      return atk.eI;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.eL;
   }

   @Override
   protected atj n_() {
      return atk.eJ;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.eM, 0.15F, 1.0F);
   }

   @Nullable
   public bzy b(aov $$0, bnj $$1) {
      return bnu.s.a((cvn)$$0);
   }

   @Override
   public boolean m(coz $$0) {
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
   protected void a(bno $$0, bno.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bog) {
         ((bog)$$0).aU = this.aU;
      }
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
