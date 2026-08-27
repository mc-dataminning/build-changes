import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buw extends bur {
   private static final cmg cb = cmg.a(cji.oH, cji.rk, cji.rj, cji.ur, cji.uo, cji.up);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public buw(biu<? extends buw> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bqu(this, 1.4));
      this.bO.a(2, new bpn(this, 1.0));
      this.bO.a(3, new brj(this, 1.0, cb, false));
      this.bO.a(4, new bqa(this, 1.1));
      this.bO.a(5, new bro(this, 1.0));
      this.bO.a(6, new bqj(this, cbu.class, 6.0F));
      this.bO.a(7, new bqw(this));
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return this.m_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 4.0).a(bkm.d, 0.25);
   }

   @Override
   public void b_() {
      super.b_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aA() ? -1.0F : 4.0F) * 0.3F;
      this.bU = arw.a(this.bU, 0.0F, 1.0F);
      if (!this.aA() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ehn $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dL().B && this.bv() && !this.m_() && !this.t() && --this.bZ <= 0) {
         this.a(apd.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cji.qd);
         this.a(djt.t);
         this.bZ = this.ag.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aR() {
      return this.aa > this.cc;
   }

   @Override
   protected void aQ() {
      this.cc = this.aa + this.bU / 2.0F;
   }

   @Override
   protected apc w() {
      return apd.ek;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.en;
   }

   @Override
   protected apc l_() {
      return apd.el;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.eo, 0.15F, 1.0F);
   }

   @Nullable
   public buw b(akq $$0, bil $$1) {
      return biu.q.a((cpv)$$0);
   }

   @Override
   public boolean m(cjf $$0) {
      return cb.a($$0);
   }

   @Override
   public int ed() {
      return this.t() ? 10 : super.ed();
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(biq $$0, biq.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bjg) {
         ((bjg)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean t() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
