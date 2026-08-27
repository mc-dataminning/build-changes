public class bwb extends bwl {
   public bwb(bfn<? extends bwb> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static bhf.a q() {
      return bwc.ge().a(bhg.d, 0.2F);
   }

   public static boolean b(bfn<bwb> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.ai() != bdu.a;
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this) && !$$0.d(this.cE());
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.a(bhg.i).a((double)($$0 * 3));
   }

   @Override
   public float bj() {
      return 1.0F;
   }

   @Override
   protected it r() {
      return iv.C;
   }

   @Override
   public boolean bL() {
      return false;
   }

   @Override
   protected int w() {
      return super.w() * 4;
   }

   @Override
   protected void fV() {
      this.d *= 0.9F;
   }

   @Override
   protected void eW() {
      eei $$0 = this.dl();
      float $$1 = (float)this.ga() * 0.1F;
      this.o($$0.c, (double)(this.eU() + $$1), $$0.e);
      this.at = true;
   }

   @Override
   protected void c(anl<dxd> $$0) {
      if ($$0 == anb.b) {
         eei $$1 = this.dl();
         this.o($$1.c, (double)(0.22F + (float)this.ga() * 0.05F), $$1.e);
         this.at = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean fW() {
      return this.cV();
   }

   @Override
   protected float fX() {
      return super.fX() + 2.0F;
   }

   @Override
   protected amg d(ben $$0) {
      return this.gb() ? amh.mO : amh.mN;
   }

   @Override
   protected amg g_() {
      return this.gb() ? amh.mF : amh.mM;
   }

   @Override
   protected amg fY() {
      return this.gb() ? amh.mR : amh.mQ;
   }

   @Override
   protected amg fZ() {
      return amh.mP;
   }
}
