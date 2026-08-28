public class cnn extends cnj {
   public cnn(bsm<? extends cnn> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnn(dcf $$0, btb $$1) {
      super(bsm.L, $$1, $$0);
   }

   public cnn(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.L, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ctx u() {
      return cuf.tW;
   }

   @Override
   protected double aZ() {
      return 0.07;
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (this.dQ() instanceof aqm) {
         this.dQ().c(2002, this.dq(), cwd.c(cwe.a));
         int $$1 = 3 + this.dQ().z.a(5) + this.dQ().z.a(5);
         bsr.a((aqm)this.dQ(), this.do(), $$1);
         this.ap();
      }
   }
}
