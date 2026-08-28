public class ckb extends ckl {
   public ckb(bsz<? extends ckb> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return ckc.gw().a(buw.r, 0.2F);
   }

   public static boolean b(bsz<ckb> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.al() != bqq.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buw.a).a((double)($$0 * 3));
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
      evq $$0 = this.ds();
      float $$1 = (float)this.gr() * 0.1F;
      this.o($$0.c, (double)(this.fh() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(axe<ent> $$0) {
      if ($$0 == awu.b) {
         evq $$1 = this.ds();
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
   protected avy d(brm $$0) {
      return this.gs() ? avz.ot : avz.os;
   }

   @Override
   protected avy o_() {
      return this.gs() ? avz.oh : avz.or;
   }

   @Override
   protected avy gp() {
      return this.gs() ? avz.ow : avz.ov;
   }

   @Override
   protected avy gq() {
      return avz.ou;
   }
}
