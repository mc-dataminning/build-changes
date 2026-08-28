import javax.annotation.Nullable;

public class cmh extends cmf implements bwx {
   private static final int b = 50;
   private static final int c = 70;
   private static final alc<Boolean> d = alg.a(cmh.class, ale.k);
   public static final String a = "sheared";

   public static bxn.a gq() {
      return cmf.m().a(bxo.s, 16.0);
   }

   public cmh(bvr<? extends cmh> $$0, dhi $$1) {
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
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(cxt.sJ) && this.a()) {
         if (this.dW() instanceof ash $$3) {
            this.a($$3, axg.h, $$2);
            this.a(ecr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected axe u() {
      return axf.cn;
   }

   @Override
   protected axe e(bua $$0) {
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
   protected cqe a(cxp $$0, float $$1, @Nullable cxp $$2) {
      cqe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqg $$4) {
         $$4.a(new bup(bur.s, 100));
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
   public void a(ash $$0, axg $$1, cxp $$2) {
      $$0.a(null, this, axf.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(ash $$0, cxp $$1) {
      this.a($$0, ewl.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.ds()));
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bL();
   }
}
