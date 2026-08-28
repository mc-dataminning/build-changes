public abstract class cip extends ciu {
   private static final bwi bG = bwo.C.n().a(0.5F).b(0.665F);

   public cip(bwo<? extends cip> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cet(this, 2.0));
      this.bD.a(2, new cdm(this, 1.0));
      this.bD.a(3, new cfi(this, 1.25, $$0 -> $$0.a(axk.ae), false));
      this.bD.a(4, new cdz(this, 1.25));
      this.bD.a(5, new cfn(this, 1.0));
      this.bD.a(6, new cei(this, crc.class, 6.0F));
      this.bD.a(7, new cev(this));
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ae);
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 10.0).a(byk.v, 0.2F);
   }

   @Override
   protected awm u() {
      return awn.gf;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.gh;
   }

   @Override
   protected awm l_() {
      return awn.gg;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.gj, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.ro) && !this.n_()) {
         $$0.a(awn.gi, 1.0F, 1.0F);
         czd $$3 = czg.a($$2, $$0, czh.ru.m());
         $$0.a($$1, $$3);
         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bG : super.e($$0);
   }
}
