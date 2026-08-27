import org.joml.Vector3f;

public class cac extends cal {
   private static final int b = 2400;
   private int c;

   public cac(bjx<? extends cac> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqy(this));
      this.bO.a(1, new bqt(this, this.dL()));
      this.bO.a(2, new bro(this, 1.0, false));
      this.bO.a(3, new bsr(this, 1.0));
      this.bO.a(7, new brm(this, ccx.class, 8.0F));
      this.bO.a(8, new brz(this));
      this.bP.a(1, new bsw(this).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true));
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.13F;
   }

   public static blo.a s() {
      return cal.gk().a(blp.l, 8.0).a(blp.m, 0.25).a(blp.c, 2.0);
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.c;
   }

   @Override
   protected aqc w() {
      return aqd.hk;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.hm;
   }

   @Override
   protected aqc m_() {
      return aqd.hl;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.hn, 0.15F, 1.0F);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(rt $$0) {
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

   public static boolean b(bjx<cac> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ccx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bko eR() {
      return bko.c;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
