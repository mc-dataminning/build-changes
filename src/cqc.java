public class cqc extends cpy {
   public cqc(but<? extends cqc> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cqc(dgj $$0, bvi $$1, cwq $$2) {
      super(but.U, $$1, $$0, $$2);
   }

   public cqc(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      super(but.U, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwm m() {
      return cwu.uU;
   }

   @Override
   protected double bd() {
      return 0.07;
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if (this.dV() instanceof ard) {
         this.dV().c(2002, this.dv(), -13083194);
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         buy.a((ard)this.dV(), this.dt(), $$1);
         this.at();
      }
   }
}
