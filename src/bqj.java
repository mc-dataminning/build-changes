public abstract class bqj<R extends Runnable> extends bqf<R> {
   private int b;

   public bqj(String $$0) {
      super($$0);
   }

   @Override
   public boolean ax() {
      return this.bD() || super.ax();
   }

   protected boolean bD() {
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
