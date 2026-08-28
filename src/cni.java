public class cni extends cns {
   public cni(bwb<? extends cni> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.v, 0.2F);
   }

   public static boolean b(bwb<cni> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.an() != btn.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bxx.a).a((double)($$0 * 3));
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   protected lt m() {
      return lv.F;
   }

   @Override
   public boolean bY() {
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
      fcu $$0 = this.dy();
      float $$1 = (float)this.go() * 0.1F;
      this.n($$0.d, (double)(this.fg() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axp<eus> $$0) {
      if ($$0 == axf.b) {
         fcu $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.go() * 0.05F), $$1.f);
         this.ar = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean t() {
      return this.dj();
   }

   @Override
   protected float x() {
      return super.x() + 2.0F;
   }

   @Override
   protected awj e(buh $$0) {
      return this.gp() ? awk.pb : awk.pa;
   }

   @Override
   protected awj l_() {
      return this.gp() ? awk.oP : awk.oZ;
   }

   @Override
   protected awj gm() {
      return this.gp() ? awk.pe : awk.pd;
   }

   @Override
   protected awj gn() {
      return awk.pc;
   }
}
