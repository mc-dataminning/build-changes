public abstract class cfd extends btn {
   private static final int cb = 100;
   private int cc;

   protected cfd(bsc<? extends cfd> $$0, daz $$1) {
      super($$0, $$1);
   }

   public boolean b(aqo $$0) {
      ud $$1 = new ud();
      $$1.a("id", this.bC());
      this.f($$1);
      if ($$0.h($$1)) {
         this.ao();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void l() {
      this.cc++;
      super.l();
   }

   public boolean gy() {
      return this.cc > 100;
   }
}
