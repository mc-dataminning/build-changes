import javax.annotation.Nullable;

public class bwv extends cjz {
   private static final akj<Integer> bO = akn.a(bwv.class, akl.b);

   public bwv(bwo<? extends bwv> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected lv q() {
      return lx.aS;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bO, 0);
   }

   @Nullable
   @Override
   public bvv a(arq $$0, bvv $$1) {
      return bwo.ag.a($$0, bwn.e);
   }

   @Override
   protected awm t() {
      return awn.ln;
   }

   @Override
   protected awm u() {
      return awn.lk;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.lm;
   }

   @Override
   protected awm l_() {
      return awn.ll;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tz $$0) {
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

      this.dV().a(lx.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bO, $$0);
   }

   public int x() {
      return this.al.a(bO);
   }

   public static boolean a(bwo<? extends bxe> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dmh.J);
   }
}
