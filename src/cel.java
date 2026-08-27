import javax.annotation.Nullable;

public class cel extends ceg {
   private static final brz cg = bsc.t.n().a(0.5F).b(0.2975F);
   public float bY;
   public float bZ;
   public float cb;
   public float cc;
   public float cd = 1.0F;
   private float ch = 1.0F;
   public int ce = this.ah.a(6000) + 6000;
   public boolean cf;

   public cel(bsc<? extends cel> $$0, daz $$1) {
      super($$0, $$1);
      this.a(enn.j, 0.0F);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cah(this, 1.4));
      this.bS.a(2, new bza(this, 1.0));
      this.bS.a(3, new caw(this, 1.0, $$0 -> $$0.a(awf.ak), false));
      this.bS.a(4, new bzn(this, 1.1));
      this.bS.a(5, new cbb(this, 1.0));
      this.bS.a(6, new bzw(this, cly.class, 6.0F));
      this.bS.a(7, new caj(this));
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? cg : super.e($$0);
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 4.0).a(bty.r, 0.25);
   }

   @Override
   public void n_() {
      super.n_();
      this.cc = this.bY;
      this.cb = this.bZ;
      this.bZ = this.bZ + (this.aE() ? -1.0F : 4.0F) * 0.3F;
      this.bZ = ayf.a(this.bZ, 0.0F, 1.0F);
      if (!this.aE() && this.cd < 1.0F) {
         this.cd = 1.0F;
      }

      this.cd *= 0.9F;
      eum $$0 = this.ds();
      if (!this.aE() && $$0.d < 0.0) {
         this.g($$0.d(1.0, 0.6, 1.0));
      }

      this.bY = this.bY + this.cd * 2.0F;
      if (!this.dP().B && this.bD() && !this.p_() && !this.u() && --this.ce <= 0) {
         this.a(avi.eT, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         this.a(ctt.qR);
         this.a(dvw.t);
         this.ce = this.ah.a(6000) + 6000;
      }
   }

   @Override
   protected boolean aV() {
      return this.ab > this.ch;
   }

   @Override
   protected void aU() {
      this.ch = this.ab + this.bZ / 2.0F;
   }

   @Override
   protected avh v() {
      return avi.eR;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.eU;
   }

   @Override
   protected avh o_() {
      return avi.eS;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.eV, 0.15F, 1.0F);
   }

   @Nullable
   public cel b(aqn $$0, brq $$1) {
      return bsc.t.a((daz)$$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ak);
   }

   @Override
   public int ej() {
      return this.u() ? 10 : super.ej();
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.cf = $$0.q("IsChickenJockey");
      if ($$0.e("EggLayTime")) {
         this.ce = $$0.h("EggLayTime");
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("IsChickenJockey", this.cf);
      $$0.a("EggLayTime", this.ce);
   }

   @Override
   public boolean h(double $$0) {
      return this.u();
   }

   @Override
   protected void a(brw $$0, brw.a $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof bsq) {
         ((bsq)$$0).aY = this.aY;
      }
   }

   public boolean u() {
      return this.cf;
   }

   public void w(boolean $$0) {
      this.cf = $$0;
   }
}
