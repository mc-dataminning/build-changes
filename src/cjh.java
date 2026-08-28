public abstract class cjh extends cjm {
   private static final bwy bI = bxe.D.n().a(0.5F).b(0.665F);

   public cjh(bxe<? extends cjh> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfl(this, 2.0));
      this.bF.a(2, new cee(this, 1.0));
      this.bF.a(3, new cga(this, 1.25, $$0 -> $$0.a(axo.af), false));
      this.bF.a(4, new cer(this, 1.25));
      this.bF.a(5, new cgf(this, 1.0));
      this.bF.a(6, new cfa(this, crz.class, 6.0F));
      this.bF.a(7, new cfn(this));
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.af);
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.v, 0.2F);
   }

   @Override
   protected awq u() {
      return awr.gf;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.gh;
   }

   @Override
   protected awq l_() {
      return awr.gg;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.ro) && !this.n_()) {
         $$0.a(awr.gi, 1.0F, 1.0F);
         daa $$3 = dad.a($$2, $$0, dae.ru.m());
         $$0.a($$1, $$3);
         return but.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bI : super.e($$0);
   }
}
