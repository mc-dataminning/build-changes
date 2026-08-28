import javax.annotation.Nullable;

public class bxj extends cko {
   private static final akl<Integer> bQ = akp.a(bxj.class, akn.b);
   private static final int bR = 0;

   public bxj(bxc<? extends bxj> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected lw q() {
      return ly.aS;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return bxc.ah.a($$0, bxb.e);
   }

   @Override
   protected awo t() {
      return awp.ln;
   }

   @Override
   protected awo u() {
      return awp.lk;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.lm;
   }

   @Override
   protected awo l_() {
      return awp.ll;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.s($$0.b("DarkTicksRemaining", 0));
   }

   @Override
   public void k_() {
      super.k_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(ly.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bQ, $$0);
   }

   public int x() {
      return this.al.a(bQ);
   }

   public static boolean a(bxc<? extends bxu> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dne.J);
   }
}
