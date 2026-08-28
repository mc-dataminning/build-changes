public abstract class bpo<R extends Runnable> extends bpk<R> {
   private int b;

   public bpo(String $$0) {
      super($$0);
   }

   @Override
   public boolean ay() {
      return this.bB() || super.ay();
   }

   protected boolean bB() {
      return this.b != 0;
   }

   @Override
   public void d(R $$0) {
      this.b++;

      try {
         super.d($$0);
      } finally {
         this.b--;
      }
   }
}
