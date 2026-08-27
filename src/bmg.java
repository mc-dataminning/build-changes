public class bmg extends bzb {
   private static final agn<Integer> bY = agq.a(bmg.class, agp.b);

   public bmg(bmc<? extends bmg> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected jv u() {
      return jx.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, 0);
   }

   @Override
   protected ars w() {
      return art.ku;
   }

   @Override
   protected ars y() {
      return art.kr;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.kt;
   }

   @Override
   protected ars n_() {
      return art.ks;
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(so $$0) {
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

      this.dL().a(jx.aN, this.d(0.6), this.dt(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bY, $$0);
   }

   public int A() {
      return this.an.b(bY);
   }

   public static boolean a(bmc<? extends bmo> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cxa.G);
   }
}
