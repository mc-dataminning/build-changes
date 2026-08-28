public class cjm extends cjw {
   public cjm(bsj<? extends cjm> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static buf.a s() {
      return cjn.gt().a(bug.v, 0.2F);
   }

   public static boolean b(bsj<cjm> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.al() != bqa.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bug.a).a((double)($$0 * 3));
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   protected lh u() {
      return lj.F;
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
   protected void gj() {
      this.e *= 0.9F;
   }

   @Override
   protected void ff() {
      evz $$0 = this.ds();
      float $$1 = (float)this.go() * 0.1F;
      this.o($$0.c, (double)(this.fd() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awk<eoa> $$0) {
      if ($$0 == awa.b) {
         evz $$1 = this.ds();
         this.o($$1.c, (double)(0.22F + (float)this.go() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gk() {
      return this.db();
   }

   @Override
   protected float gl() {
      return super.gl() + 2.0F;
   }

   @Override
   protected ave d(bqw $$0) {
      return this.gp() ? avf.ot : avf.os;
   }

   @Override
   protected ave o_() {
      return this.gp() ? avf.oh : avf.or;
   }

   @Override
   protected ave gm() {
      return this.gp() ? avf.ow : avf.ov;
   }

   @Override
   protected ave gn() {
      return avf.ou;
   }
}
