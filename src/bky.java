public class bky extends bxq {
   private static final afo<Integer> bX = afr.a(bky.class, afq.b);

   public bky(bku<? extends bky> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected jq u() {
      return js.aK;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
   }

   @Override
   protected aqq w() {
      return aqr.jW;
   }

   @Override
   protected aqq y() {
      return aqr.jT;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.jV;
   }

   @Override
   protected aqq m_() {
      return aqr.jU;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void c_() {
      super.c_();
      int $$0 = this.A();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dN().a(js.aL, this.d(0.6), this.dv(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int A() {
      return this.an.b(bX);
   }

   public static boolean a(bku<? extends blg> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cvc.G);
   }
}
