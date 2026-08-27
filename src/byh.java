import javax.annotation.Nullable;

public class byh extends byc {
   private static final cqh cc = cqh.a(cnj.pu, cnj.rY, cnj.rX, cnj.vh, cnj.ve, cnj.vf);
   private static final blz cd = bmc.s.n().a(0.5F).b(0.2975F);
   public float bU;
   public float bV;
   public float bX;
   public float bY;
   public float bZ = 1.0F;
   private float ce = 1.0F;
   public int ca = this.ag.a(6000) + 6000;
   public boolean cb;

   public byh(bmc<? extends byh> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(1, new bud(this, 1.4));
      this.bP.a(2, new bsw(this, 1.0));
      this.bP.a(3, new bus(this, 1.0, cc, false));
      this.bP.a(4, new btj(this, 1.1));
      this.bP.a(5, new bux(this, 1.0));
      this.bP.a(6, new bts(this, cfq.class, 6.0F));
      this.bP.a(7, new buf(this));
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 4.0).a(bnu.o, 0.25);
   }

   @Override
   public void d_() {
      super.d_();
      this.bY = this.bU;
      this.bX = this.bV;
      this.bV = this.bV + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bV = aup.a(this.bV, 0.0F, 1.0F);
      if (!this.aC() && this.bZ < 1.0F) {
         this.bZ = 1.0F;
      }

      this.bZ *= 0.9F;
      emc $$0 = this.do();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bU = this.bU + this.bZ * 2.0F;
      if (!this.dL().B && this.bx() && !this.o_() && !this.w() && --this.ca <= 0) {
         this.a(art.eK, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cnj.qQ);
         this.b(dnz.t);
         this.ca = this.ag.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.aa > this.ce;
   }

   @Override
   protected void aS() {
      this.ce = this.aa + this.bV / 2.0F;
   }

   @Override
   protected ars y() {
      return art.eI;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.eL;
   }

   @Override
   protected ars n_() {
      return art.eJ;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.eM, 0.15F, 1.0F);
   }

   @Nullable
   public byh b(ane $$0, blr $$1) {
      return bmc.s.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return cc.a($$0);
   }

   @Override
   public int ee() {
      return this.w() ? 10 : super.ee();
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.cb = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ca = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cb);
      $$0.a("EggLayTime", this.ca);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(blw $$0, blw.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bmo) {
         ((bmo)$$0).aU = this.aU;
      }
   }

   public boolean w() {
      return this.cb;
   }

   public void w(boolean $$0) {
      this.cb = $$0;
   }
}
