import javax.annotation.Nullable;

public class cmg extends cme implements bww {
   private static final int b = 50;
   private static final int c = 70;
   private static final alc<Boolean> d = alg.a(cmg.class, ale.k);
   public static final String a = "sheared";

   public static bxm.a gq() {
      return cme.m().a(bxn.s, 16.0);
   }

   public cmg(bvq<? extends cmg> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gr() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.sJ) && this.a()) {
         if (this.dW() instanceof ash $$3) {
            this.a($$3, axg.h, $$2);
            this.a(ecq.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe u() {
      return axf.cn;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.cp;
   }

   @Override
   protected axe o_() {
      return axf.co;
   }

   @Override
   protected axe p() {
      return axf.cr;
   }

   @Override
   protected cqd a(cxo $$0, float $$1, @Nullable cxo $$2) {
      cqd $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqf $$4) {
         $$4.a(new buo(buq.s, 100));
      }

      return $$3;
   }

   @Override
   protected int x() {
      return 50;
   }

   @Override
   protected int go() {
      return 70;
   }

   @Override
   public void a(ash $$0, axg $$1, cxo $$2) {
      $$0.a(null, this, axf.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(ash $$0, cxo $$1) {
      this.a($$0, ewk.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.ds()));
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bL();
   }
}
