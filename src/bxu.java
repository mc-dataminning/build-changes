import javax.annotation.Nullable;

public class bxu extends ckz {
   private static final aku<Integer> bQ = aky.a(bxu.class, akw.b);
   private static final int bR = 0;

   public bxu(bxn<? extends bxu> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected lx m() {
      return lz.aS;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return bxn.ah.a($$0, bxm.e);
   }

   @Override
   protected awx p() {
      return awy.ln;
   }

   @Override
   protected awx s() {
      return awy.lk;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.lm;
   }

   @Override
   protected awx j_() {
      return awy.ll;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.s($$0.b("DarkTicksRemaining", 0));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.u();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.dV().a(lz.aT, this.d(0.6), this.dD(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.al.a(bQ, $$0);
   }

   public int u() {
      return this.al.a(bQ);
   }

   public static boolean a(bxn<? extends byf> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      return $$3.v() <= $$1.P() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dnq.J);
   }
}
