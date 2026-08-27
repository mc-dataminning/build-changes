public abstract class byf extends bmq {
   private static final int bW = 100;
   private int bX;

   protected byf(blj<? extends byf> $$0, csy $$1) {
      super($$0, $$1);
   }

   public boolean b(amq $$0) {
      sj $$1 = new sj();
      $$1.a("id", this.bw());
      this.f($$1);
      if ($$0.h($$1)) {
         this.am();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.bX++;
      super.l();
   }

   public boolean gn() {
      return this.bX > 100;
   }
}
