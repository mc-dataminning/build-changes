public class cmw extends cng {
   public cmw(bvr<? extends cmw> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.v, 0.2F);
   }

   public static boolean b(bvr<cmw> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.al() != btg.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxo.a).a((double)($$0 * 3));
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
      fby $$0 = this.dz();
      float $$1 = (float)this.go() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(ayk<etw> $$0) {
      if ($$0 == aya.b) {
         fby $$1 = this.dz();
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
   protected axe e(bua $$0) {
      return this.gp() ? axf.oL : axf.oK;
   }

   @Override
   protected axe o_() {
      return this.gp() ? axf.oz : axf.oJ;
   }

   @Override
   protected axe gm() {
      return this.gp() ? axf.oO : axf.oN;
   }

   @Override
   protected axe gn() {
      return axf.oM;
   }
}
