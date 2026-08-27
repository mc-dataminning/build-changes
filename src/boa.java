public class boa extends caw {
   private static final aie<Integer> bX = aih.a(boa.class, aig.b);

   public boa(bnw<? extends boa> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected jx u() {
      return jz.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bX, 0);
   }

   @Override
   protected atk w() {
      return atl.kv;
   }

   @Override
   protected atk y() {
      return atl.ks;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.ku;
   }

   @Override
   protected atk n_() {
      return atl.kt;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sw $$0) {
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

      this.dM().a(jz.aN, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.am.b(bX, $$0);
   }

   public int A() {
      return this.am.b(bX);
   }

   public static boolean a(bnw<? extends boi> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cyu.G);
   }
}
