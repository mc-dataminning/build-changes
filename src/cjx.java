public class cjx extends ckh {
   public cjx(bsv<? extends cjx> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public static bur.a s() {
      return cjy.gw().a(bus.r, 0.2F);
   }

   public static boolean b(bsv<cjx> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.al() != bqm.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(bus.a).a((double)($$0 * 3));
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
   protected void gm() {
      this.e *= 0.9F;
   }

   @Override
   protected void fj() {
      evm $$0 = this.ds();
      float $$1 = (float)this.gr() * 0.1F;
      this.o($$0.c, (double)(this.fh() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(axb<enp> $$0) {
      if ($$0 == awr.b) {
         evm $$1 = this.ds();
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
   protected avv d(bri $$0) {
      return this.gs() ? avw.ot : avw.os;
   }

   @Override
   protected avv o_() {
      return this.gs() ? avw.oh : avw.or;
   }

   @Override
   protected avv gp() {
      return this.gs() ? avw.ow : avw.ov;
   }

   @Override
   protected avv gq() {
      return avw.ou;
   }
}
