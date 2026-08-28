public class cmn extends cmx {
   public cmn(bvi<? extends cmn> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.v, 0.2F);
   }

   public static boolean b(bvi<cmn> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.am() != bsx.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxf.a).a((double)($$0 * 3));
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   protected lq p() {
      return ls.F;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected int t() {
      return super.t() * 4;
   }

   @Override
   protected void x() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      fbr $$0 = this.dz();
      float $$1 = (float)this.go() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(aya<etp> $$0) {
      if ($$0 == axq.b) {
         fbr $$1 = this.dz();
         this.n($$1.d, (double)(0.22F + (float)this.go() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gk() {
      return this.dk();
   }

   @Override
   protected float gl() {
      return super.gl() + 2.0F;
   }

   @Override
   protected awu e(btr $$0) {
      return this.gp() ? awv.oR : awv.oQ;
   }

   @Override
   protected awu o_() {
      return this.gp() ? awv.oF : awv.oP;
   }

   @Override
   protected awu gm() {
      return this.gp() ? awv.oU : awv.oT;
   }

   @Override
   protected awu gn() {
      return awv.oS;
   }
}
