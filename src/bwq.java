import javax.annotation.Nullable;

public class bwq extends cjp {
   private static final akh<Integer> bN = akl.a(bwq.class, akj.b);

   public bwq(bwj<? extends bwq> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected lv q() {
      return lx.aS;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bN, 0);
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return bwj.ag.a($$0, bwi.e);
   }

   @Override
   protected awk t() {
      return awl.lj;
   }

   @Override
   protected awk u() {
      return awl.lg;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.li;
   }

   @Override
   protected awk l_() {
      return awl.lh;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tx $$0) {
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
   public boolean a(aro $$0, bup $$1, float $$2) {
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

   public static boolean a(bwj<? extends bwz> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dlw.J);
   }
}
