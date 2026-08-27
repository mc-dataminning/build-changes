import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwo extends bwj {
   private static final coc cb = coc.a(cle.oH, cle.rl, cle.rk, cle.us, cle.up, cle.uq);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bwo(bkm<? extends bwo> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsm(this, 1.4));
      this.bO.a(2, new brf(this, 1.0));
      this.bO.a(3, new btb(this, 1.0, cb, false));
      this.bO.a(4, new brs(this, 1.1));
      this.bO.a(5, new btg(this, 1.0));
      this.bO.a(6, new bsb(this, cdm.class, 6.0F));
      this.bO.a(7, new bso(this));
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 4.0).a(bme.m, 0.25);
   }

   @Override
   public void c_() {
      super.c_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aA() ? -1.0F : 4.0F) * 0.3F;
      this.bU = ati.a(this.bU, 0.0F, 1.0F);
      if (!this.aA() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      eji $$0 = this.do();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dL().B && this.bv() && !this.n_() && !this.t() && --this.bZ <= 0) {
         this.a(aqn.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cle.qd);
         this.a(dlg.t);
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
   protected aqm w() {
      return aqn.ek;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.en;
   }

   @Override
   protected aqm m_() {
      return aqn.el;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bwo b(ama $$0, bkd $$1) {
      return bkm.q.a((crs)$$0);
   }

   @Override
   public boolean m(clb $$0) {
      return cb.a($$0);
   }

   @Override
   public int ed() {
      return this.t() ? 10 : super.ed();
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
      return this.t();
   }

   @Override
   protected void a(bki $$0, bki.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bky) {
         ((bky)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean t() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
