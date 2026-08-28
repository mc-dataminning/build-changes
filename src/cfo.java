import javax.annotation.Nullable;

public class cfo extends cfh {
   private static final bsz bY = btc.w.n().a(0.5F).b(0.665F);

   public cfo(btc<? extends cfo> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cbi(this, 2.0));
      this.bS.a(2, new cab(this, 1.0));
      this.bS.a(3, new cbx(this, 1.25, $$0 -> $$0.a(awy.aa), false));
      this.bS.a(4, new cao(this, 1.25));
      this.bS.a(5, new ccc(this, 1.0));
      this.bS.a(6, new cax(this, cmz.class, 6.0F));
      this.bS.a(7, new cbk(this));
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.aa);
   }

   public static buy.a s() {
      return btt.A().a(buz.q, 10.0).a(buz.r, 0.2F);
   }

   @Override
   protected avz v() {
      return awa.gb;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.gd;
   }

   @Override
   protected avz o_() {
      return awa.gc;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.qy) && !this.p_()) {
         $$0.a(awa.ge, 1.0F, 1.0F);
         cur $$3 = cut.a($$2, $$0, cuu.qE.w());
         $$0.a($$1, $$3);
         return bqw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfo b(arf $$0, bsq $$1) {
      return btc.w.a((dca)$$0);
   }

   @Override
   public bsz e(bud $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
