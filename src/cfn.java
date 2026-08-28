import javax.annotation.Nullable;

public class cfn extends cfg {
   private static final bsy bY = btb.w.n().a(0.5F).b(0.665F);

   public cfn(btb<? extends cfn> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cbh(this, 2.0));
      this.bS.a(2, new caa(this, 1.0));
      this.bS.a(3, new cbw(this, 1.25, $$0 -> $$0.a(awy.aa), false));
      this.bS.a(4, new can(this, 1.25));
      this.bS.a(5, new ccb(this, 1.0));
      this.bS.a(6, new caw(this, cmy.class, 6.0F));
      this.bS.a(7, new cbj(this));
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.aa);
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 10.0).a(buy.r, 0.2F);
   }

   @Override
   protected avz v() {
      return awa.gb;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.gd;
   }

   @Override
   protected avz o_() {
      return awa.gc;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.qy) && !this.p_()) {
         $$0.a(awa.ge, 1.0F, 1.0F);
         cuq $$3 = cus.a($$2, $$0, cut.qE.w());
         $$0.a($$1, $$3);
         return bqv.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfn b(arf $$0, bsp $$1) {
      return btb.w.a((dbz)$$0);
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
