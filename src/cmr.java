public class cmr extends cnb {
   public cmr(bvm<? extends cmr> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.v, 0.2F);
   }

   public static boolean b(bvm<cmr> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.al() != btb.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxj.a).a((double)($$0 * 3));
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
      fbs $$0 = this.dy();
      float $$1 = (float)this.gm() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(ayk<eto> $$0) {
      if ($$0 == aya.b) {
         fbs $$1 = this.dy();
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
   protected axe e(btv $$0) {
      return this.gn() ? axf.oK : axf.oJ;
   }

   @Override
   protected axe o_() {
      return this.gn() ? axf.oy : axf.oI;
   }

   @Override
   protected axe gk() {
      return this.gn() ? axf.oN : axf.oM;
   }

   @Override
   protected axe gl() {
      return axf.oL;
   }
}
