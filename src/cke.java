public class cke extends cko {
   public cke(btc<? extends cke> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static buy.a s() {
      return ckf.gw().a(buz.r, 0.2F);
   }

   public static boolean b(btc<cke> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.al() != bqt.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buz.a).a((double)($$0 * 3));
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   protected lg u() {
      return li.F;
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gm() {
      this.e *= 0.9F;
   }

   @Override
   protected void fj() {
      evt $$0 = this.ds();
      float $$1 = (float)this.gr() * 0.1F;
      this.o($$0.c, (double)(this.fh() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(axf<enw> $$0) {
      if ($$0 == awv.b) {
         evt $$1 = this.ds();
         this.o($$1.c, (double)(0.22F + (float)this.gr() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gn() {
      return this.db();
   }

   @Override
   protected float go() {
      return super.go() + 2.0F;
   }

   @Override
   protected avz d(brp $$0) {
      return this.gs() ? awa.ot : awa.os;
   }

   @Override
   protected avz o_() {
      return this.gs() ? awa.oh : awa.or;
   }

   @Override
   protected avz gp() {
      return this.gs() ? awa.ow : awa.ov;
   }

   @Override
   protected avz gq() {
      return awa.ou;
   }
}
