import javax.annotation.Nullable;

public class che extends cgx {
   private static final bun bY = bur.C.n().a(0.5F).b(0.665F);

   public che(bur<? extends che> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cby(this));
      this.bS.a(1, new ccx(this, 2.0));
      this.bS.a(2, new cbq(this, 1.0));
      this.bS.a(3, new cdm(this, 1.25, $$0 -> $$0.a(awy.ad), false));
      this.bS.a(4, new ccd(this, 1.25));
      this.bS.a(5, new cdr(this, 1.0));
      this.bS.a(6, new ccm(this, cow.class, 6.0F));
      this.bS.a(7, new ccz(this));
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.ad);
   }

   public static bwn.a p() {
      return cgx.gx().a(bwo.s, 10.0).a(bwo.v, 0.2F);
   }

   @Override
   protected avz u() {
      return awa.gd;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.gf;
   }

   @Override
   protected avz o_() {
      return awa.ge;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.rf) && !this.e_()) {
         $$0.a(awa.gg, 1.0F, 1.0F);
         cwo $$3 = cwr.a($$2, $$0, cws.rl.n());
         $$0.a($$1, $$3);
         return bsj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public che b(ard $$0, bub $$1) {
      return bur.C.a($$0, buq.e);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
