public class cmr extends cnb {
   public cmr(bvi<? extends cmr> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.v, 0.2F);
   }

   public static boolean b(bvi<cmr> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.an() != bsv.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxg.a).a((double)($$0 * 3));
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   protected lr m() {
      return lt.F;
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   protected int n() {
      return super.n() * 4;
   }

   @Override
   protected void q() {
      this.d *= 0.9F;
   }

   @Override
   public void s() {
      fbx $$0 = this.dx();
      float $$1 = (float)this.gq() * 0.1F;
      this.n($$0.d, (double)(this.fj() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axf<etv> $$0) {
      if ($$0 == awv.b) {
         fbx $$1 = this.dx();
         this.n($$1.d, (double)(0.22F + (float)this.gq() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean t() {
      return this.di();
   }

   @Override
   protected float x() {
      return super.x() + 2.0F;
   }

   @Override
   protected avz e(btp $$0) {
      return this.gr() ? awa.pb : awa.pa;
   }

   @Override
   protected avz l_() {
      return this.gr() ? awa.oP : awa.oZ;
   }

   @Override
   protected avz go() {
      return this.gr() ? awa.pe : awa.pd;
   }

   @Override
   protected avz gp() {
      return awa.pc;
   }
}
