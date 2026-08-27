public class bmc extends byw {
   private static final agm<Integer> bX = agp.a(bmc.class, ago.b);

   public bmc(bly<? extends bmc> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected jv u() {
      return jx.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
   }

   @Override
   protected arq w() {
      return arr.kf;
   }

   @Override
   protected arq y() {
      return arr.kc;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.ke;
   }

   @Override
   protected arq n_() {
      return arr.kd;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.A();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dM().a(jx.aN, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
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

   public static boolean a(bly<? extends bmk> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cwr.G);
   }
}
