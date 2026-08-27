public class ceq extends ces {
   public ceq(bku<? extends ceq> $$0, csa $$1) {
      super($$0, $$1);
   }

   public ceq(csa $$0, blg $$1) {
      super(bku.aP, $$1, $$0);
   }

   public ceq(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cle s() {
      return clm.qz;
   }

   private jq y() {
      clj $$0 = this.u();
      return (jq)($$0.b() ? js.R : new jo(js.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         jq $$1 = this.y();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN().a($$1, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      bkq $$1 = $$0.a();
      int $$2 = $$1 instanceof cas ? 3 : 0;
      $$1.a(this.dO().b(this, this.w()), (float)$$2);
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, (byte)3);
         this.am();
      }
   }
}
