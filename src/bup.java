import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bup extends buk {
   private static final cly cb = cly.a(cjb.oH, cjb.rk, cjb.rj, cjb.ur, cjb.uo, cjb.up);
   public float bT;
   public float bU;
   public float bW;
   public float bX;
   public float bY = 1.0F;
   private float cc = 1.0F;
   public int bZ = this.ag.a(6000) + 6000;
   public boolean ca;

   public bup(bim<? extends bup> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.j, 0.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bqn(this, 1.4));
      this.bO.a(2, new bpg(this, 1.0));
      this.bO.a(3, new brc(this, 1.0, cb, false));
      this.bO.a(4, new bpt(this, 1.1));
      this.bO.a(5, new brh(this, 1.0));
      this.bO.a(6, new bqc(this, cbn.class, 6.0F));
      this.bO.a(7, new bqp(this));
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return this.i_() ? $$1.b * 0.85F : $$1.b * 0.92F;
   }

   public static bke.a p() {
      return bja.x().a(bkf.a, 4.0).a(bkf.d, 0.25);
   }

   @Override
   public void b_() {
      super.b_();
      this.bX = this.bT;
      this.bW = this.bU;
      this.bU = this.bU + (this.aA() ? -1.0F : 4.0F) * 0.3F;
      this.bU = arp.a(this.bU, 0.0F, 1.0F);
      if (!this.aA() && this.bY < 1.0F) {
         this.bY = 1.0F;
      }

      this.bY *= 0.9F;
      ehe $$0 = this.dn();
      if (!this.aA() && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.bT = this.bT + this.bY * 2.0F;
      if (!this.dK().B && this.bv() && !this.i_() && !this.q() && --this.bZ <= 0) {
         this.a(aow.em, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         this.a(cjb.qd);
         this.a(djk.t);
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
   protected aov r() {
      return aow.ek;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.en;
   }

   @Override
   protected aov h_() {
      return aow.el;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.eo, 0.15F, 1.0F);
   }

   @Nullable
   public bup b(akk $$0, bid $$1) {
      return bim.q.a((cpm)$$0);
   }

   @Override
   public boolean m(ciy $$0) {
      return cb.a($$0);
   }

   @Override
   public int ec() {
      return this.q() ? 10 : super.ec();
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
      return this.q();
   }

   @Override
   protected void a(bii $$0, bii.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof biy) {
         ((biy)$$0).aU = this.aU;
      }
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b, -0.1F * $$2);
   }

   public boolean q() {
      return this.ca;
   }

   public void w(boolean $$0) {
      this.ca = $$0;
   }
}
