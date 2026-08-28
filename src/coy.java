public class coy extends cpi {
   public coy(bxc<? extends coy> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static byz.a j() {
      return coz.gx().a(bza.v, 0.2F);
   }

   public static boolean b(bxc<coy> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.an() != buo.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.g(bza.a).a((double)($$0 * 3));
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   protected lw m() {
      return ly.F;
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
      ffq $$0 = this.dy();
      float $$1 = (float)this.gs() * 0.1F;
      this.n($$0.d, (double)(this.fh() + $$1), $$0.f);
      this.ar = true;
   }

   @Override
   protected void c(axt<exn> $$0) {
      if ($$0 == axj.b) {
         ffq $$1 = this.dy();
         this.n($$1.d, (double)(0.22F + (float)this.gs() * 0.05F), $$1.f);
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
   protected awo e(bvi $$0) {
      return this.gt() ? awp.pf : awp.pe;
   }

   @Override
   protected awo l_() {
      return this.gt() ? awp.oT : awp.pd;
   }

   @Override
   protected awo gq() {
      return this.gt() ? awp.pi : awp.ph;
   }

   @Override
   protected awo gr() {
      return awp.pg;
   }
}
