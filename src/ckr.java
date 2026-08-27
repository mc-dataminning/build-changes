public class ckr extends cjz {
   private int g = 200;

   public ckr(bqb<? extends ckr> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckr(cyx $$0, bqo $$1, crj $$2) {
      super(bqb.aU, $$1, $$0, $$2);
   }

   public ckr(cyx $$0, double $$1, double $$2, double $$3, crj $$4) {
      super(bqb.aU, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(kl.Q, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bqo $$0) {
      super.a($$0);
      bph $$1 = new bph(bpj.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected crj x() {
      return new crj(crm.vn);
   }
}
