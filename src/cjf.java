public abstract class cjf extends cjk {
   private static final bww bI = bxc.D.n().a(0.5F).b(0.665F);

   public cjf(bxc<? extends cjf> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cfj(this, 2.0));
      this.bF.a(2, new cec(this, 1.0));
      this.bF.a(3, new cfy(this, 1.25, $$0 -> $$0.a(axm.ae), false));
      this.bF.a(4, new cep(this, 1.25));
      this.bF.a(5, new cgd(this, 1.0));
      this.bF.a(6, new cey(this, crx.class, 6.0F));
      this.bF.a(7, new cfl(this));
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ae);
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 10.0).a(bza.v, 0.2F);
   }

   @Override
   protected awo u() {
      return awp.gf;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.gh;
   }

   @Override
   protected awo l_() {
      return awp.gg;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.ro) && !this.n_()) {
         $$0.a(awp.gi, 1.0F, 1.0F);
         czy $$3 = dab.a($$2, $$0, dac.ru.m());
         $$0.a($$1, $$3);
         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bI : super.e($$0);
   }
}
