public class cjq extends cka {
   public cjq(bsn<? extends cjq> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static buj.a s() {
      return cjr.gt().a(buk.v, 0.2F);
   }

   public static boolean b(bsn<cjq> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.al() != bqe.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buk.a).a((double)($$0 * 3));
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   protected lh t() {
      return lj.F;
   }

   @Override
   public boolean bS() {
      return false;
   }

   @Override
   protected int x() {
      return super.x() * 4;
   }

   @Override
   protected void gj() {
      this.e *= 0.9F;
   }

   @Override
   protected void fh() {
      ewh $$0 = this.du();
      float $$1 = (float)this.go() * 0.1F;
      this.o($$0.c, (double)(this.ff() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awm<eoi> $$0) {
      if ($$0 == awc.b) {
         ewh $$1 = this.du();
         this.o($$1.c, (double)(0.22F + (float)this.go() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gk() {
      return this.dd();
   }

   @Override
   protected float gl() {
      return super.gl() + 2.0F;
   }

   @Override
   protected avg d(bra $$0) {
      return this.gp() ? avh.ot : avh.os;
   }

   @Override
   protected avg n_() {
      return this.gp() ? avh.oh : avh.or;
   }

   @Override
   protected avg gm() {
      return this.gp() ? avh.ow : avh.ov;
   }

   @Override
   protected avg gn() {
      return avh.ou;
   }
}
