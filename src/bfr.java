public class bfr extends bsk {
   private static final aby<Integer> bX = acb.a(bfr.class, aca.b);

   public bfr(bfn<? extends bfr> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected it q() {
      return iv.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bX, 0);
   }

   @Override
   protected amg r() {
      return amh.jC;
   }

   @Override
   protected amg s() {
      return amh.jz;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.jB;
   }

   @Override
   protected amg g_() {
      return amh.jA;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.w());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void b_() {
      super.b_();
      int $$0 = this.w();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dI().a(iv.aK, this.d(0.6), this.dq(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.am.b(bX, $$0);
   }

   public int w() {
      return this.am.b(bX);
   }

   public static boolean a(bfn<? extends bfz> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      return $$3.v() <= $$1.t_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cpo.G);
   }
}
