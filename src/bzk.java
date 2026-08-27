public class bzk extends bzm {
   public bzk(bfn<? extends bzk> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzk(cmm $$0, bfz $$1) {
      super(bfn.aP, $$1, $$0);
   }

   public bzk(cmm $$0, double $$1, double $$2, double $$3) {
      super(bfn.aP, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cfu k() {
      return cgc.pO;
   }

   private it q() {
      cfz $$0 = this.o();
      return (it)($$0.b() ? iv.R : new ir(iv.O, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         it $$1 = this.q();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dI().a($$1, this.dn(), this.dp(), this.dt(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      bfj $$1 = $$0.a();
      int $$2 = $$1 instanceof bvm ? 3 : 0;
      $$1.a(this.dJ().b(this, this.v()), (float)$$2);
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      if (!this.dI().B) {
         this.dI().a(this, (byte)3);
         this.ai();
      }
   }
}
