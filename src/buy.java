import javax.annotation.Nullable;

public class buy extends chw {
   private static final ajy<Integer> cg = akc.a(buy.class, aka.b);

   public buy(bur<? extends buy> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected lr p() {
      return lt.aR;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cg, 0);
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      return bur.ag.a($$0, buq.e);
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
   protected avz e(bta $$0) {
      return awa.li;
   }

   @Override
   protected avz o_() {
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
   public void d_() {
      super.d_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(lt.aS, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(cg, $$0);
   }

   public int x() {
      return this.al.a(cg);
   }

   public static boolean a(bur<? extends bvg> $$0, dgy $$1, buq $$2, ji $$3, azh $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(djn.J);
   }
}
