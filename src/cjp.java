public class cjp extends cjz {
   public cjp(bsm<? extends cjp> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public static bui.a s() {
      return cjq.gu().a(buj.v, 0.2F);
   }

   public static boolean b(bsm<cjp> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqd.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buj.a).a((double)($$0 * 3));
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   protected lh u() {
      return lj.F;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected int y() {
      return super.y() * 4;
   }

   @Override
   protected void gk() {
      this.e *= 0.9F;
   }

   @Override
   protected void fg() {
      ewf $$0 = this.dt();
      float $$1 = (float)this.gp() * 0.1F;
      this.o($$0.c, (double)(this.fe() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awm<eog> $$0) {
      if ($$0 == awc.b) {
         ewf $$1 = this.dt();
         this.o($$1.c, (double)(0.22F + (float)this.gp() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gl() {
      return this.dc();
   }

   @Override
   protected float gm() {
      return super.gm() + 2.0F;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.gq() ? avh.ot : avh.os;
   }

   @Override
   protected avg o_() {
      return this.gq() ? avh.oh : avh.or;
   }

   @Override
   protected avg gn() {
      return this.gq() ? avh.ow : avh.ov;
   }

   @Override
   protected avg go() {
      return avh.ou;
   }
}
