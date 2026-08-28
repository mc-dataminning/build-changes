import javax.annotation.Nullable;

public class cfh extends cfa {
   private static final bss bY = bsv.w.n().a(0.5F).b(0.665F);

   public cfh(bsv<? extends cfh> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cbb(this, 2.0));
      this.bS.a(2, new bzu(this, 1.0));
      this.bS.a(3, new cbq(this, 1.25, $$0 -> $$0.a(awu.aa), false));
      this.bS.a(4, new cah(this, 1.25));
      this.bS.a(5, new cbv(this, 1.0));
      this.bS.a(6, new caq(this, cms.class, 6.0F));
      this.bS.a(7, new cbd(this));
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.aa);
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 10.0).a(bus.r, 0.2F);
   }

   @Override
   protected avv v() {
      return avw.gb;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.gd;
   }

   @Override
   protected avv o_() {
      return avw.gc;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.qy) && !this.p_()) {
         $$0.a(avw.ge, 1.0F, 1.0F);
         cuk $$3 = cum.a($$2, $$0, cun.qE.w());
         $$0.a($$1, $$3);
         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfh b(arb $$0, bsj $$1) {
      return bsv.w.a((dbt)$$0);
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
