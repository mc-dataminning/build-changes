public class cto extends ctk {
   public cto(bxn<? extends cto> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public cto(dkj $$0, byf $$1, dak $$2) {
      super(bxn.V, $$1, $$0, $$2);
   }

   public cto(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.V, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected dag g() {
      return dao.vf;
   }

   @Override
   protected double bc() {
      return 0.07;
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (this.dV() instanceof asb) {
         this.dV().c(2002, this.dv(), -13083194);
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         bxs.a((asb)this.dV(), $$0.g(), $$1);
         this.aq();
      }
   }
}
