import javax.annotation.Nullable;

public class chg extends cgz {
   private static final bup bY = but.C.n().a(0.5F).b(0.665F);

   public chg(but<? extends chg> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cca(this));
      this.bS.a(1, new ccz(this, 2.0));
      this.bS.a(2, new cbs(this, 1.0));
      this.bS.a(3, new cdo(this, 1.25, $$0 -> $$0.a(awy.ad), false));
      this.bS.a(4, new ccf(this, 1.25));
      this.bS.a(5, new cdt(this, 1.0));
      this.bS.a(6, new cco(this, coy.class, 6.0F));
      this.bS.a(7, new cdb(this));
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.ad);
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 10.0).a(bwq.v, 0.2F);
   }

   @Override
   protected avz u() {
      return awa.gd;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.gf;
   }

   @Override
   protected avz o_() {
      return awa.ge;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(cwu.rf) && !this.e_()) {
         $$0.a(awa.gg, 1.0F, 1.0F);
         cwq $$3 = cwt.a($$2, $$0, cwu.rl.n());
         $$0.a($$1, $$3);
         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chg b(ard $$0, bud $$1) {
      return but.C.a($$0, bus.e);
   }

   @Override
   public bup e(bvu $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
