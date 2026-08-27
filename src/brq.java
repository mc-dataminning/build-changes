import javax.annotation.Nullable;

public class brq extends brl {
   private static final ciz cb = ciz.a(cgc.oH, cgc.rk, cgc.rj, cgc.ur, cgc.uo, cgc.up);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.af.a(6000) + 6000;
   public boolean ca;

   public brq(bfn<? extends brq> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.j, 0.0F);
   }

   @Override
   protected void x() {
      this.bO.a(0, new bmp(this));
      this.bO.a(1, new bno(this, 1.4));
      this.bO.a(2, new bmh(this, 1.0));
      this.bO.a(3, new bod(this, 1.0, cb, false));
      this.bO.a(4, new bmu(this, 1.1));
      this.bO.a(5, new boi(this, 1.0));
      this.bO.a(6, new bnd(this, byo.class, 6.0F));
      this.bO.a(7, new bnq(this));
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return this.h_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bhf.a q() {
      return bgb.y().a(bhg.a, 4.0).a(bhg.d, 0.25);
   }

   @Override
   public void b_() {
      super.b_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.ay() ? -1.0F : 4.0F) * 0.3F;
      this.bU = apa.a(this.bU, 0.0F, 1.0F);
      if (!this.ay() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      eei $$0 = this.dl();
      if (!this.ay() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dI().B && this.bs() && !this.h_() && !this.r() && --this.bZ <= 0) {
         this.a(amh.em, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         this.a(cgc.qd);
         this.a(dgl.t);
         this.bZ = this.af.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aP() {
      return this.Z > this.cc;
   }

   @Override
   protected void aO() {
      this.cc = this.Z + this.bU / 2.0F;
   }

   @Override
   protected amg s() {
      return amh.ek;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.en;
   }

   @Override
   protected amg g_() {
      return amh.el;
   }

   @Override
   protected void b(gu $$0, dcb $$1) {
      this.a(amh.eo, 0.15F, 1.0F);
   }

   @Nullable
   public brq b(aif $$0, bfe $$1) {
      return bfn.q.a((cmm)$$0);
   }

   @Override
   public boolean m(cfz $$0) {
      return cb.a($$0);
   }

   @Override
   public int ea() {
      return this.r() ? 10 : super.ea();
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.r();
   }

   @Override
   protected void a(bfj $$0, bfj.a $$1) {
      super.a($$0, $$1);
      float $$2 = apa.a(this.aV * (float) (Math.PI / 180.0));
      float $$3 = apa.b(this.aV * (float) (Math.PI / 180.0));
      float $$4 = 0.1F;
      float $$5 = 0.0F;
      $$1.accept($$0, this.dn() + (double)(0.1F * $$2), this.e(0.5) + $$0.bw() + 0.0, this.dt() - (double)(0.1F * $$3));
      if ($$0 instanceof bfz) {
         ((bfz)$$0).aV = this.aV;
      }
   }

   public boolean r() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
