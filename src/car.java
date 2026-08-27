import org.joml.Vector3f;

public class car extends cba {
   private static final int b = 2400;
   private int c;

   public car(bkm<? extends car> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void z() {
      this.bO.a(1, new brn(this));
      this.bO.a(1, new bri(this, this.dL()));
      this.bO.a(2, new bsd(this, 1.0, false));
      this.bO.a(3, new btg(this, 1.0));
      this.bO.a(7, new bsb(this, cdm.class, 8.0F));
      this.bO.a(8, new bso(this));
      this.bP.a(1, new btl(this).a());
      this.bP.a(2, new btm<>(this, cdm.class, true));
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.13F;
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 8.0).a(bme.m, 0.25).a(bme.c, 2.0);
   }

   @Override
   protected bki.b aU() {
      return bki.b.c;
   }

   @Override
   protected aqm w() {
      return aqn.hm;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.ho;
   }

   @Override
   protected aqm m_() {
      return aqn.hn;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.hp, 0.15F, 1.0F);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dB();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void c_() {
      super.c_();
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(js.X, this.d(0.5), this.dt(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fL()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.ak();
         }
      }
   }

   public static boolean b(bkm<car> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cdm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bld eR() {
      return bld.c;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
