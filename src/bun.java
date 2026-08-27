import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bun extends bui {
   private static final clw cb = clw.a(ciz.oH, ciz.rk, ciz.rj, ciz.ur, ciz.uo, ciz.up);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bun(bik<? extends bun> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.j, 0.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bql(this, 1.4));
      this.bO.a(2, new bpe(this, 1.0));
      this.bO.a(3, new bra(this, 1.0, cb, false));
      this.bO.a(4, new bpr(this, 1.1));
      this.bO.a(5, new brf(this, 1.0));
      this.bO.a(6, new bqa(this, cbl.class, 6.0F));
      this.bO.a(7, new bqn(this));
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 4.0).a(bkd.d, 0.25);
   }

   @Override
   public void b_() {
      super.b_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aA() ? -1.0F : 4.0F) * 0.3F;
      this.bU = aro.a(this.bU, 0.0F, 1.0F);
      if (!this.aA() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ehf $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dK().B && this.bv() && !this.i_() && !this.q() && --this.bZ <= 0) {
         this.a(aou.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(ciz.qd);
         this.a(dji.t);
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
   protected aot r() {
      return aou.ek;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.en;
   }

   @Override
   protected aot h_() {
      return aou.el;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bun b(aki $$0, bib $$1) {
      return bik.q.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return cb.a($$0);
   }

   @Override
   public int ec() {
      return this.q() ? 10 : super.ec();
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.ca = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.bZ = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.ca);
      $$0.a("EggLayTime", this.bZ);
   }

   @Override
   public boolean h(double $$0) {
      return this.q();
   }

   @Override
   protected void a(big $$0, big.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof biw) {
         ((biw)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean q() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
