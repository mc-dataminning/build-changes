public class cjd extends cjn {
   public cjd(bsc<? extends cjd> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static btx.a s() {
      return cje.gv().a(bty.r, 0.2F);
   }

   public static boolean b(bsc<cjd> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.ak() != bpt.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bty.a).a((double)($$0 * 3));
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   protected kw u() {
      return ky.F;
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
   protected void gl() {
      this.e *= 0.9F;
   }

   @Override
   protected void fj() {
      eum $$0 = this.ds();
      float $$1 = (float)this.gq() * 0.1F;
      this.o($$0.c, (double)(this.fh() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awm<emv> $$0) {
      if ($$0 == awc.b) {
         eum $$1 = this.ds();
         this.o($$1.c, (double)(0.22F + (float)this.gq() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gm() {
      return this.db();
   }

   @Override
   protected float gn() {
      return super.gn() + 2.0F;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.gr() ? avi.ot : avi.os;
   }

   @Override
   protected avh o_() {
      return this.gr() ? avi.oh : avi.or;
   }

   @Override
   protected avh go() {
      return this.gr() ? avi.ow : avi.ov;
   }

   @Override
   protected avh gp() {
      return avi.ou;
   }
}
