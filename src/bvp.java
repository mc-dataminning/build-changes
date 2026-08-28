import javax.annotation.Nullable;

public class bvp extends ciq {
   private static final ajx<Integer> bN = akb.a(bvp.class, ajz.b);

   public bvp(bvi<? extends bvp> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected lr q() {
      return lt.aS;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.ag.a($$0, bvh.e);
   }

   @Override
   protected avz t() {
      return awa.lj;
   }

   @Override
   protected avz u() {
      return awa.lg;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.li;
   }

   @Override
   protected avz l_() {
      return awa.lh;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.s($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void k_() {
      super.k_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dU().a(lt.aT, this.d(0.6), this.dC(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bN, $$0);
   }

   public int x() {
      return this.al.a(bN);
   }

   public static boolean a(bvi<? extends bvy> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dkg.J);
   }
}
