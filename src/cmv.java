public class cmv extends cnf {
   public cmv(bvq<? extends cmv> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static bxm.a m() {
      return cmw.gr().a(bxn.v, 0.2F);
   }

   public static boolean b(bvq<cmv> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.al() != btf.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxn.a).a((double)($$0 * 3));
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
      fbx $$0 = this.dy();
      float $$1 = (float)this.gm() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(ayk<etv> $$0) {
      if ($$0 == aya.b) {
         fbx $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gm() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gi() {
      return this.dj();
   }

   @Override
   protected float gj() {
      return super.gj() + 2.0F;
   }

   @Override
   protected axe e(btz $$0) {
      return this.gn() ? axf.oL : axf.oK;
   }

   @Override
   protected axe o_() {
      return this.gn() ? axf.oz : axf.oJ;
   }

   @Override
   protected axe gk() {
      return this.gn() ? axf.oO : axf.oN;
   }

   @Override
   protected axe gl() {
      return axf.oM;
   }
}
