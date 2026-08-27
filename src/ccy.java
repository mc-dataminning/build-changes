import javax.annotation.Nullable;

public class ccy extends cct {
   private static final cwd cg = cwd.a(csg.pv, csg.rZ, csg.rY, csg.vl, csg.vi, csg.vj);
   private static final bqo ch = bqr.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ci = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public ccy(bqr<? extends ccy> $$0, czu $$1) {
      super($$0, $$1);
      this.a(emi.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new byu(this, 1.4));
      this.bS.a(2, new bxn(this, 1.0));
      this.bS.a(3, new bzj(this, 1.0, cg, false));
      this.bS.a(4, new bya(this, 1.1));
      this.bS.a(5, new bzo(this, 1.0));
      this.bS.a(6, new byj(this, ckl.class, 6.0F));
      this.bS.a(7, new byw(this));
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? ch : super.e($$0);
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 4.0).a(bsl.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = axw.a(this.bZ, 0.0F, 1.0F);
      if (!this.aC() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      etf $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dN().B && this.bB() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(auz.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(csg.qR);
         this.a(dur.t);
         this.ce = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.ab > this.ci;
   }

   @Override
   protected void aS() {
      this.ci = this.ab + this.bZ / 2.0F;
   }

   @Override
   protected auy v() {
      return auz.eR;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.eU;
   }

   @Override
   protected auy o_() {
      return auz.eS;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.eV, 0.15F, 1.0F);
   }

   @Nullable
   public ccy b(aqe $$0, bqf $$1) {
      return bqr.t.a((czu)$$0);
   }

   @Override
   public boolean o(csd $$0) {
      return cg.a($$0);
   }

   @Override
   public int eh() {
      return this.u() ? 10 : super.eh();
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(bql $$0, bql.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bre) {
         ((bre)$$0).aZ = this.aZ;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
