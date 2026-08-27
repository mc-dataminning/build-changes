public class cjb extends cjl {
   public cjb(bsa<? extends cjb> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static btv.a s() {
      return cjc.gv().a(btw.r, 0.2F);
   }

   public static boolean b(bsa<cjb> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.ak() != bpr.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(btw.a).a((double)($$0 * 3));
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
      euk $$0 = this.ds();
      float $$1 = (float)this.gq() * 0.1F;
      this.o($$0.c, (double)(this.fh() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awl<emt> $$0) {
      if ($$0 == awb.b) {
         euk $$1 = this.ds();
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
   protected avg d(bqn $$0) {
      return this.gr() ? avh.ot : avh.os;
   }

   @Override
   protected avg o_() {
      return this.gr() ? avh.oh : avh.or;
   }

   @Override
   protected avg go() {
      return this.gr() ? avh.ow : avh.ov;
   }

   @Override
   protected avg gp() {
      return avh.ou;
   }
}
