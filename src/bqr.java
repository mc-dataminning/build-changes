public abstract class bqr<R extends Runnable> extends bqn<R> {
   private int b;

   public bqr(String $$0) {
      super($$0);
   }

   @Override
   public boolean ax() {
      return this.bC() || super.ax();
   }

   protected boolean bC() {
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
