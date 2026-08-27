import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bur extends bum {
   private static final cmb cb = cmb.a(cjd.oH, cjd.rk, cjd.rj, cjd.ur, cjd.uo, cjd.up);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bur(bip<? extends bur> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.j, 0.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bqp(this, 1.4));
      this.bO.a(2, new bpi(this, 1.0));
      this.bO.a(3, new bre(this, 1.0, cb, false));
      this.bO.a(4, new bpv(this, 1.1));
      this.bO.a(5, new brj(this, 1.0));
      this.bO.a(6, new bqe(this, cbp.class, 6.0F));
      this.bO.a(7, new bqr(this));
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 4.0).a(bkh.d, 0.25);
   }

   @Override
   public void b_() {
      super.b_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aA() ? -1.0F : 4.0F) * 0.3F;
      this.bU = ars.a(this.bU, 0.0F, 1.0F);
      if (!this.aA() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ehi $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dK().B && this.bv() && !this.i_() && !this.q() && --this.bZ <= 0) {
         this.a(aoz.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cjd.qd);
         this.a(djo.t);
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
   protected aoy r() {
      return aoz.ek;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.en;
   }

   @Override
   protected aoy h_() {
      return aoz.el;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bur b(akn $$0, big $$1) {
      return bip.q.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return cb.a($$0);
   }

   @Override
   public int ec() {
      return this.q() ? 10 : super.ec();
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.q();
   }

   @Override
   protected void a(bil $$0, bil.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bjb) {
         ((bjb)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean q() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
