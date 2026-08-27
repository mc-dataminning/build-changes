import javax.annotation.Nullable;

public class cdu extends cdp {
   private static final brk cg = brn.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public cdu(brn<? extends cdu> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(1, new bzq(this, 1.4));
      this.bS.a(2, new byj(this, 1.0));
      this.bS.a(3, new caf(this, 1.0, $$0 -> $$0.a(avz.ak), false));
      this.bS.a(4, new byw(this, 1.1));
      this.bS.a(5, new cak(this, 1.0));
      this.bS.a(6, new bzf(this, clh.class, 6.0F));
      this.bS.a(7, new bzs(this));
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static btg.a r() {
      return bsc.A().a(bth.q, 4.0).a(bth.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = axz.a(this.bZ, 0.0F, 1.0F);
      if (!this.aC() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      etp $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dN().B && this.bB() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(avc.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctc.qR);
         this.a(dva.t);
         this.ce = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.ab > this.ch;
   }

   @Override
   protected void aS() {
      this.ch = this.ab + this.bZ / 2.0F;
   }

   @Override
   protected avb v() {
      return avc.eR;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.eU;
   }

   @Override
   protected avb o_() {
      return avc.eS;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cdu b(aqh $$0, brb $$1) {
      return brn.t.a((dad)$$0);
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.ak);
   }

   @Override
   public int eh() {
      return this.u() ? 10 : super.eh();
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(brh $$0, brh.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bsa) {
         ((bsa)$$0).aZ = this.aZ;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
