public class ckp extends ckf {
   public ckp(bqb<? extends ckp> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckp(cyx $$0, bqo $$1, double $$2, double $$3, double $$4) {
      super(bqb.aP, $$1, $$2, $$3, $$4, $$0);
   }

   public ckp(cyx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bqb.aP, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bpv $$1 = $$0.a();
         bpv $$2 = this.u();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((ckf)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bqo) {
            this.a((bqo)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(erw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bpv $$1 = this.u();
         if (!($$1 instanceof bqq) || this.dM().aa().b(cyt.c)) {
            ib $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, dbl.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      return false;
   }
}
