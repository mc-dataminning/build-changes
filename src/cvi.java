public class cvi extends cuv {
   private final djj b = new djj() {
      @Override
      public void a(dkj $$0, iw $$1, int $$2) {
         $$0.a(cvi.this, (byte)$$2);
      }
   };
   private final Runnable c;

   public cvi(bxn<? extends cvi> $$0, dkj $$1) {
      super($$0, $$1);
      this.c = this.c($$1);
   }

   @Override
   protected dag p() {
      return dao.ov;
   }

   @Override
   public dak dI() {
      return new dak(dao.ov);
   }

   private Runnable c(dkj $$0) {
      return $$0 instanceof asb ? () -> this.b.a((asb)$$0, this.dv()) : () -> this.b.a($$0, this.dv());
   }

   @Override
   public ebq v() {
      return dnq.cD.m();
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.b.a(this.dV(), this.dv(), $$0);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      this.b.a($$0);
   }

   @Override
   public void b(byte $$0) {
      this.b.a(this.dV(), $$0);
   }

   @Override
   public void g() {
      super.g();
      this.c.run();
   }

   public djj e() {
      return this.b;
   }
}
