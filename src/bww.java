import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bww extends bwr {
   private static final cok cb = cok.a(clm.ps, clm.rW, clm.rV, clm.vd, clm.va, clm.vb);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bww(bku<? extends bww> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.j, 0.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bsu(this, 1.4));
      this.bO.a(2, new brn(this, 1.0));
      this.bO.a(3, new btj(this, 1.0, cb, false));
      this.bO.a(4, new bsa(this, 1.1));
      this.bO.a(5, new bto(this, 1.0));
      this.bO.a(6, new bsj(this, cdu.class, 6.0F));
      this.bO.a(7, new bsw(this));
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return this.n_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 4.0).a(bmm.m, 0.25);
   }

   @Override
   public void c_() {
      super.c_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aC() ? -1.0F : 4.0F) * 0.3F;
      this.bU = atm.a(this.bU, 0.0F, 1.0F);
      if (!this.aC() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      eju $$0 = this.dq();
      if (!this.aC() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dN().B && this.bx() && !this.n_() && !this.w() && --this.bZ <= 0) {
         this.a(aqr.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(clm.qO);
         this.a(dls.t);
         this.bZ = this.ag.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aT() {
      return this.aa > this.cc;
   }

   @Override
   protected void aS() {
      this.cc = this.aa + this.bU / 2.0F;
   }

   @Override
   protected aqq y() {
      return aqr.ek;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.en;
   }

   @Override
   protected aqq m_() {
      return aqr.el;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bww b(ame $$0, bkl $$1) {
      return bku.q.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return cb.a($$0);
   }

   @Override
   public int ef() {
      return this.w() ? 10 : super.ef();
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.w();
   }

   @Override
   protected void a(bkq $$0, bkq.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof blg) {
         ((blg)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean w() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
