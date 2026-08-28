import javax.annotation.Nullable;

public class chd extends cgw {
   private static final bum bY = buq.C.n().a(0.5F).b(0.665F);

   public chd(buq<? extends chd> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new ccw(this, 2.0));
      this.bS.a(2, new cbp(this, 1.0));
      this.bS.a(3, new cdl(this, 1.25, $$0 -> $$0.a(awx.ad), false));
      this.bS.a(4, new ccc(this, 1.25));
      this.bS.a(5, new cdq(this, 1.0));
      this.bS.a(6, new ccl(this, cov.class, 6.0F));
      this.bS.a(7, new ccy(this));
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ad);
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.v, 0.2F);
   }

   @Override
   protected avy u() {
      return avz.gd;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.gf;
   }

   @Override
   protected avy o_() {
      return avz.ge;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.rf) && !this.e_()) {
         $$0.a(avz.gg, 1.0F, 1.0F);
         cwn $$3 = cwq.a($$2, $$0, cwr.rl.n());
         $$0.a($$1, $$3);
         return bsi.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chd b(arc $$0, bua $$1) {
      return buq.C.a($$0, bup.e);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
