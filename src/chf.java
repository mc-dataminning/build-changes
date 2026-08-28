import javax.annotation.Nullable;

public class chf extends cgy {
   private static final buo bY = bus.C.n().a(0.5F).b(0.665F);

   public chf(bus<? extends chf> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 2.0));
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.25, $$0 -> $$0.a(awy.ad), false));
      this.bS.a(4, new cce(this, 1.25));
      this.bS.a(5, new cds(this, 1.0));
      this.bS.a(6, new ccn(this, cox.class, 6.0F));
      this.bS.a(7, new cda(this));
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.ad);
   }

   public static bwo.a p() {
      return cgy.gx().a(bwp.s, 10.0).a(bwp.v, 0.2F);
   }

   @Override
   protected avz u() {
      return awa.gd;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.gf;
   }

   @Override
   protected avz o_() {
      return awa.ge;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.rf) && !this.e_()) {
         $$0.a(awa.gg, 1.0F, 1.0F);
         cwp $$3 = cws.a($$2, $$0, cwt.rl.n());
         $$0.a($$1, $$3);
         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chf b(ard $$0, buc $$1) {
      return bus.C.a($$0, bur.e);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
