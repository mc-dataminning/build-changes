import javax.annotation.Nullable;

public class bxl extends ckq {
   private static final akn<Integer> bQ = akr.a(bxl.class, akp.b);
   private static final int bR = 0;

   public bxl(bxe<? extends bxl> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected lx q() {
      return lz.aS;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return bxe.ah.a($$0, bxd.e);
   }

   @Override
   protected awq t() {
      return awr.ln;
   }

   @Override
   protected awq u() {
      return awr.lk;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.lm;
   }

   @Override
   protected awq l_() {
      return awr.ll;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(ua $$0) {
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

      this.dV().a(lz.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
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

   public static boolean a(bxe<? extends bxw> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dng.J);
   }
}
